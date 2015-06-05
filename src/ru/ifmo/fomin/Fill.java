package ru.ifmo.fomin;

/*---------Заполнение-массивов-----------*/
public class Fill {
    public static char[][] a = new char[3][3];
    public static char[][] b = new char[3][12];
    public static char[][] c = new char[3][3];
    int i, k;

    public void fill() {
        CheckEnd checkEnd = new CheckEnd();

        for (i = 0; i < 3; i++) {
            for (k = 0; k < 3; k++) {

                a[i][k] = 'W';
                c[i][k] = 'Y';
                checkEnd.a[i][k] = a[i][k];
                checkEnd.c[i][k] = c[i][k];

            }

            for (k = 0; k < 12; k++) {
                if (k < 3) b[i][k] = 'O';
                else if ((k >= 3) && (k < 6)) b[i][k] = 'G';
                else if ((k >= 6) && (k < 9)) b[i][k] = 'R';
                else b[i][k] = 'B';
                checkEnd.b[i][k] = b[i][k];
            }

        }
    }

    public enum Moves {

        MoveU(new MoveU()), MoveR(new MoveR()), MoveL(new MoveL()), MoveF(new MoveF()), MoveD(new MoveD()), MoveB(new MoveB());

        public Object value;
        private Moves(Object value1) {

            value = value1;


        }

    }


    public void move() {

        Moves[] enumMoves = Moves.values();
        Object ob = Moves.valueOf("MoveU");
        ob = new Object();
        ob.getClass().getMethods();
        for (Moves moves : enumMoves) {

            /*System.out.println(moves + " - " + moves.value.getClass());
            ob = moves.value.getClass();*/
        }



    }


}
