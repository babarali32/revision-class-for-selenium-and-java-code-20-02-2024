package class17;
public class task04 {
        private int privateValue;
        public int publicValue;
        int defaultValue;
        protected int protectedValue;

        // Private constructor
        private task04(int privateValue) {
            this.privateValue = privateValue;
        }

        // Public constructor
        public task04(int privateValue, int publicValue) {
            this(privateValue);
            this.publicValue = publicValue;
        }

        // Default constructor
        task04(int privateValue, int publicValue, int defaultValue) {
            this(privateValue, publicValue);
            this.defaultValue = defaultValue;
        }

        // Protected constructor
        protected task04(int privateValue, int publicValue, int defaultValue, int protectedValue) {
            this(privateValue, publicValue, defaultValue);
            this.protectedValue = protectedValue;
        }

    }
