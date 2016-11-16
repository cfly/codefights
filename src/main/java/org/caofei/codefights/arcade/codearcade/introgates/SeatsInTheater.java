package org.caofei.codefights.arcade.codearcade.introgates;

public class SeatsInTheater {
    int seatsInTheater(int nCols, int nRows, int col, int row) {
        return (nCols - col + 1) * (nRows - row);
    }

}
