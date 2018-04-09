package Section06C_Polymorphism.Codelab034_Polymorphism;

public class Movie {

    private String Name;

    public Movie(String name) {
        Name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return Name;
    }

    /**
     * OTHER CLASSES THAT INHERIT FROM MOVIE
     */

    // Jaws
    class Jaws extends Movie {
        public Jaws() {
            super("Jaws");
        }

        @Override
        public String plot() {
            return "A shark eats lots of people";
        }
    }

    // Independence day
    class IndependenceDay extends Movie {
        public IndependenceDay() {
            super("Independence Day");
        }

        @Override
        public String plot() {
            return "Aliens attempt to take over planet Earth";
        }
    }

    // Maze Runner
    class MazeRunner extends Movie {
        public MazeRunner() {
            super("Maze Runner");
        }

        @Override
        public String plot() {
            return "Kids try and escape a maze.";
        }
    }

    // Star Wars
    class StarWars extends Movie {
        public StarWars() {
            super("Star Wars");
        }

        @Override
        public String plot() {
            return "Imperial Forces try to take over the universe";
        }
    }

    // Forgettable
    class Forgettable extends Movie {
        public Forgettable() {
            super("Forgettable");

            // No plot method
        }
    }


    public class Main {
        public void main(String[] args) {
            for (int i = 1; i < 11; i++) {
                Movie movie = randomMovie();
                System.out.println("Movie #" + i +
                        " : " + movie.getName() + "\n" +
                        "Plot: " + movie.plot() + "\n");
            }
        }

        public Movie randomMovie() {
            int randomNumber = (int) (Math.random() * 5) + 1;
            System.out.println("Random number generated was: " + randomNumber);

            switch (randomNumber) {
                case 1:
                    return new Jaws();
                case 2:
                    return new IndependenceDay();
                case 3:
                    return new MazeRunner();
                case 4:
                    return new Forgettable();
            }
            return null;
        }
    }

}
