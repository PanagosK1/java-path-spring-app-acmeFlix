package gr.codelearn.spring.app.domain.enumeration;

public enum Subscription {
        BASIC(2), STANDARD(4), PREMIUM(6);
        private final int profile;

    Subscription(int profile) {
            this.profile = profile;
        }

        public float getProfiles() {
            return this.profile;
        }
}

