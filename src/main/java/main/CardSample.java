package main;


import cards.CardProfile;
import cards.CardSearch;
import cards.CardSocial;
import cards.CardWeather;
import totalcross.sys.Settings;
import totalcross.ui.MainWindow;

public class CardSample extends MainWindow{
	public CardSample(){
		setBackColor(0xDCDCDC);
		setUIStyle(Settings.Material);
        Settings.uiAdjustmentsBasedOnFontHeight = true;
	}
	public void initUI() {
		
		add(new CardSearch(),CENTER,TOP+50,PARENTSIZE+96,PARENTSIZE+10);
		add(new CardProfile(),CENTER,AFTER+50,PARENTSIZE+96,PARENTSIZE+40);
		add(new CardWeather(),CENTER,AFTER+50,PARENTSIZE+96,PARENTSIZE+30);	
		add(new CardSocial(),CENTER,AFTER+50,PARENTSIZE+96,PARENTSIZE+10);
	}
}
