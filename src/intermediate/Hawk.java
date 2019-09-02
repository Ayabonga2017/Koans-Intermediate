package intermediate;

    class Hawk extends  Bird{

        @Override
        public void printWing() { }

        public static void main(String[] args) {
            Hawk use = new Hawk();
            use.fly();
            use.waddle();
        }
    }
