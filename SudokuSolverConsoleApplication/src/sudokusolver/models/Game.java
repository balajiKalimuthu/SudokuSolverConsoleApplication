package sudokusolver.models;

// SUDOKU SOLVER APPLICATION MODEL - GAME PAGE

public class Game {
	private int play[][];
	private int answer[][];
	private int maxVal;
	private int rowVal;
	private int colVal;
	private int count;
	private int mistake = 3;
	private int score = 100;
	private int i, j;

	public Game(int row, int col, int[][] play, int[][] answer) {
		this.play = play;
		this.answer = answer;
		this.maxVal = row;
		this.rowVal = row;
		this.colVal = col;
	}

	public int[][] getPlay() {
		return play;
	}

	public int[][] getAnswer() {
		return answer;
	}

	public int getMaxVal() {
		return maxVal;
	}

	public int getRowVal() {
		return rowVal;
	}

	public int getColVal() {
		return colVal;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getMistake() {
		return mistake;
	}

	public int getScore() {
		return score;
	}

	public void display() {
		for (i = 0; i < rowVal; i++) {
			System.out.print("\t+");
			for (j = 0; j < colVal; j++) {
				System.out.print("---+");
			}
			System.out.print("\n\t|");
			for (j = 0; j < colVal; j++) {
				System.out.print(" " + play[i][j] + " |");
			}
			System.out.print("\n");
		}
		System.out.print("\t+");
		for (j = 0; j < colVal; j++) {
			System.out.print("---+");
		}
		System.out.print("\n");
	}

	public void setValue(int row, int col, int value) {
		play[row - 1][col - 1] = value;
	}

	public int playValue(int row, int col) {
		return play[row - 1][col - 1];
	}

	public int answerValue(int row, int col) {
		return answer[row - 1][col - 1];
	}
}