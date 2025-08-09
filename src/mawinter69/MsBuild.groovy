package mawinter69

class MsBuild implements Serializable {
    public enum Platform {
        ANYCPU("Any CPU"),
        X86("x86"),
        X64("x64");

        public final String label;

        private Platform(String label) {
            this.label = label;
        }

        @Override 
        public String toString() { 
            return this.label; 
        }
    }
}