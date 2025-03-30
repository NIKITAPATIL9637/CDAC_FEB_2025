import java.util.*;
import java.util.Collection;
public class NQueen{
	public boolean isSafe(int row, int col, char[][]board){
		//Horizontally
		for(int j=0; j<board.length; j++){
			if(board[row][j] == 'Q'){
				return false;
			}
		}
		
		//Vertically
		for(int i=0; i<board[0].length; i++){
			if(board[i][col] == 'Q'){
				return false;
			}
		}
		
		//upper left
		int r = row;
		for(int c=col; c>=0 && r>=0; c--, r--){
			if(board[r][c] == 'Q'){
				return false;
			}
		}
		
		//upper right
		for(int c=col; c<board.length && r>=0; r--, c++){
			if(board[r][c] == 'Q'){
				return false;
			}
		}
		
		//lower left
		for(int c=col; c>=0 && r<board.length; r++, c--){
			if(board[r][c] == 'Q'){
				return false;
			}
		}
		
		//lower right
		for(int c=col; c<board.length && r<board.length; c++, r++){
			if(board[r][c] == 'Q'){
				return false;
			}
		}
		return true;
	}
	
	public void saveBoard(char[][] board, List<List<String>> allBoards){
		String row = "";
		List<String> nowBoard = new ArrayList<>();
		
		for(int i=0; i<board.length; i++){
			row = "";
			for(int j=0; j<board[0].length; j++){
				if(board[i][j] == 'Q')
					row = row + 'Q';
				else
					row = row + '.';	
			}
			nowBoard.add(row);
		}
		allBoards.add(nowBoard);
	}
	
	public void helper(char[][] board, List<List<String>> allBoards, int col){
		//Base Condition
		if(col == board.length){
			saveBoard(board, allBoards);
			return;
		}
		
		for(int row=0; row<board.length; row++){
			if(isSafe(row, col, board)){
				board[row][col] = 'Q';
				helper(board, allBoards, col+1);
				board[row][col] = '.';
			}
		}
	}
	
	public List<List<String>> solveNqeen(int n){
		List<List<String>> allBoards = new ArrayList<>();
		char[][] board = new char[n][n];
		
		helper(board, allBoards, 0);
		return allBoards;
	}
}