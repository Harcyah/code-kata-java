package com.harcyah.kata.misc.movie_rental;

public enum Category {

    CHILDRENS {

        @Override
        public double getCost(int days) {
            double cost = 1.5;
            if (days > 3) {
                cost += (days - 3) * 1.5;
            }
            return cost;
        }

        @Override
        public int getRenterPoints(int days) {
            return 1;
        }

    },

    NEW_RELEASE {

        @Override
        public double getCost(int days) {
            return days * 3.0;
        }

        @Override
        public int getRenterPoints(int days) {
            return days == 1 ? 1 : 2;
        }

    },

    REGULAR {

        @Override
        public double getCost(int days) {
            double cost = 2;
            if (days > 2) {
                cost += (days - 2) * 1.5;
            }
            return cost;
        }

        @Override
        public int getRenterPoints(int days) {
            return 1;
        }

    };

    public abstract double getCost(int days);

    public abstract int getRenterPoints(int days);

}
