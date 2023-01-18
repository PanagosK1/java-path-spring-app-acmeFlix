package gr.codelearn.spring.app.configuration;


import gr.codelearn.spring.app.domain.*;
import gr.codelearn.spring.app.helper.CsvWriter;
import gr.codelearn.spring.app.repository.*;
import gr.codelearn.spring.app.transfer.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

@Configuration
@EnableScheduling
public class BackupTaskConfig {

	private static final Logger LOG = LoggerFactory.getLogger(BackupTaskConfig.class);

	@Autowired
	AccountRepository accountRepository;
	@Autowired
	ActorRepository actorRepository;
	@Autowired
	EpisodeRepository episodeRepository;
	@Autowired
	GenreRepository genreRepository;
	@Autowired
	MovieRepository movieRepository;
	@Autowired
	SerieRepository serieRepository;
	@Autowired
	ProfileRepository profileRepository;
	@Autowired
	RatingRepository ratingRepository;
	@Autowired
	SeasonRepository seasonRepository;
	@Autowired
	ViewRepository viewRepository;

	@Autowired
	BackUpRepository backupRepository;


	@Scheduled(cron = "0 0 12 * * *")
	public void createBackup() {
		LOG.info("Create backup at ({})", LocalDateTime.now());

		CsvWriter<Account> accountCsvWriter = new CsvWriter<>();
		CsvWriter<Actor> actorCsvWriter = new CsvWriter<>();
		CsvWriter<Episode> episodeCsvWriter = new CsvWriter<>();
		CsvWriter<Backup> backupCsvWriter = new CsvWriter<>();
		CsvWriter<Genre> genreCsvWriter = new CsvWriter<>();
		CsvWriter<Movie> movieCsvWriter = new CsvWriter<>();
		CsvWriter<Profile> profileCsvWriter = new CsvWriter<>();
		CsvWriter<Rating> ratingCsvWriter = new CsvWriter<>();
		CsvWriter<Season> seasonCsvWriter = new CsvWriter<>();
		CsvWriter<Serie> serieCsvWriter = new CsvWriter<>();
		CsvWriter<View> viewCsvWriter = new CsvWriter<>();
		CsvWriter<Pair> pairCsvWriter = new CsvWriter<>();


		try {
			InputStream input = new FileInputStream(System.getProperty("user.dir") + "/acmeFlix/src/main/resources/config.properties");
			Properties properties = new Properties();
			properties.load(input);
			String backupPath = properties.getProperty("backupPath");

			accountCsvWriter.writeToCsv(accountRepository.findAll(), "ID, FIRSTNAME, LASTNAME, PASSWORD, EMAIL, SUBSCRIPTION, AGE", backupPath,"Accounts");
			actorCsvWriter.writeToCsv(actorRepository.findAll(), "ID, FULLNAME", backupPath, "Actors");
			episodeCsvWriter.writeToCsv(episodeRepository.findAll(), "ID, DURATION, SEASON_ID, TITLE", backupPath, "Episodes");
			backupCsvWriter.writeToCsv(backupRepository.findAll(), "ID, PATH, DATE", backupPath, "Backups");
			genreCsvWriter.writeToCsv(genreRepository.findAll(), "ID, CATEGORY", backupPath, "Genres");
			movieCsvWriter.writeToCsv(movieRepository.findAll(), "ID, TITLE, AGE_RESTRICTION, YEAR_PUBLISHED, DURATION", backupPath, "Movies");
			profileCsvWriter.writeToCsv(profileRepository.findAll(), "ID, USERNAME, ACCOUNT_ID", backupPath, "Profiles");
			ratingCsvWriter.writeToCsv(ratingRepository.findAll(), "ID, MOVIE_ID, SERIE_ID, PROFILE_ID, RATE, COMMENT", backupPath, "Ratings");
			seasonCsvWriter.writeToCsv(seasonRepository.findAll(), "ID, SERIE_ID, SEASON", backupPath, "Seasons");
			serieCsvWriter.writeToCsv(serieRepository.findAll(), "ID, TITLE, AGE_RESTRICTION, YEAR_PUBLISHED, DURATION", backupPath, "Series");
			viewCsvWriter.writeToCsv(viewRepository.findAll(), "ID, MOVIE_ID, SERIE_ID, PROFILE_ID, VIEWED_DURATION, DATE", backupPath, "Views");

			pairCsvWriter.writeToCsv(movieRepository.getMovieActorsTable(), "MOVIE_ID, ACTOR_ID", backupPath, "Movie_Actors");
			pairCsvWriter.writeToCsv(movieRepository.getMovieGenresTable(), "MOVIE_ID, GENRE_ID", backupPath, "Movie_Genres");
			pairCsvWriter.writeToCsv(serieRepository.getSerieActorsTable(), "SERIE_ID, ACTOR_ID", backupPath, "Serie_Actors");
			pairCsvWriter.writeToCsv(serieRepository.getSerieGenresTable(), "SERIE_ID, GENRE_ID", backupPath, "Serie_Genres");


			Backup backup = new Backup();
			backup.setDate(Date.valueOf(LocalDate.now()));
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			backup.setPath(backupPath +   dtf.format(LocalDateTime.now()));
			backupRepository.save(backup);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}


	}

}
