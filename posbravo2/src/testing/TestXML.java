package testing;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import pointOfSale.*;

public class TestXML {

	public static void main(String[] args) {
		String a = null;
		if(a == null){
			if(a.equals("a") || a == null){
				System.out.print("Works");
			}
		}
		if(true)return;
		/*String checker [] = new String [9];
		checker[3] = "22.26";
		checker[8] = "30.25";
		int purchase = Integer.valueOf(checker[8].replace(".", ""));
		int authorize = Integer.valueOf(checker[3].replace(".", ""));
		int subt = purchase - authorize;
		//DecimalFormat df = new DecimalFormat("0.00");
		ReceiptPanel.addItem(String.valueOf(subt), "Remaining Balance");
		ReceiptPanel.saveReceipt();
		if(true)return;
		*/
		//Object retrn[] = new Object[]{true};
		//if((boolean)retrn[0] == true){
		//	System.out.println("IT WORKS");
		//	return;
		//}
		String ref = "0";
		/*String card = "0~IPAD100KB|24~98AC18281702140C|1~33|2~2EE099E348918FB1BBFF1D5C0FEAEBA1FE02E62B303661AE804C5233A225A716D674C685DC92C0B9D3AD2BA2F1307063EFBB168239C98836|3~9E7952E11A1230CC702D7AA11BFB8F7A138A34C694E8D5986006AE1DC8BB5040EB0380F4B40D6BBB|4~|6~%M373953006001001^MANUAL ENTRY/^15120000000000000000?|7~;373953006001001=15120000000000000?|8~|9~00000000|10~000001|11~9500030000081C2000C5|12~00000000|"
					
				;
		Pattern pregex = Pattern.compile("3~.*\\|4");
		Matcher m = pregex.matcher(card);
		m.find();
		System.out.println(m.group());
		Pattern pregex1 = Pattern.compile("11~.*\\|12");
		Matcher m1 = pregex1.matcher(card);
		m1.find();*/
//		System.out.print(m1.group());
		//String one[] = {"22", "22", "POS BRAVO v1.0", card.substring(m1.start()+3, m1.end()-3), card.substring(m.start()+2, m.end()-2), "1.09", "1.09", "123", "4 Corporate SQ", "30329"};
	//	String one[] = {"23", "23", "POS BRAVO v1.0", card.substring(m1.start()+3, m1.end()-3), card.substring(m.start()+2, m.end()-2), "1.08", "1.08", "1234", "1661 E. Camelback", "85016"};
//		String one[] = {"24", "24", "POS BRAVO v1.0", card.substring(m1.start()+3, m1.end()-3), card.substring(m.start()+2, m.end()-2), "1.10", "1.10", "123", "4 Corporate SQ", "30329"};
		
		String four[] = {"16", "16", "POS BRAVO v1.0", "9500030000081C20001A", "2B11F45ABEE6A6B288A76FED3BBCCE63130970C742BDD607D75F09821AAF2C6482F1AB593E0A97BA", "2.00", "2.00"};
		//non encrypted cc 
		Response set = new Response();
		set.setIDnPas("merchantID2");
/*	
		//Testing For Manual Entry

		        //PreAuth Encrypted
				Response test = new Response(4, one);
				
				System.out.println(test.getXML());
				System.out.println(test.getResponse());
				System.out.println("____________________________________________");
		
				
				//PreAuth Capture		
				String [] info = getCodes(test.getResponse());
				String two[] = {"23", "23", info[2], "1.08", "1.08", "", info[0], info[3]};
				
				test = new Response(2, two);
				
				System.out.println(test.getXML());
				System.out.println(test.getResponse());
				System.out.println("____________________________________________");
		
				
				//Reversal Voidsale
				String [] info2 = getCodes(test.getResponse());
				
				String three[] = {"23", info2[1], "POS BRAVO v1.0", info2[2], "1.08", info2[3], info2[4], info2[0], "merchantID1" };

				test = new Response(3, three);
				
				System.out.println(test.getXML());
				System.out.println(test.getResponse());
				System.out.println("____________________________________________");
*/		
		
/*		
	//Testing for Card Present(Swiped) Preauth and Preauthcapture
		
				//PreAuth Encrypted
				Response test = new Response(4, one);
		
				System.out.println(test.getXML());
				System.out.println(test.getResponse());
				System.out.println("____________________________________________");
				
				//PreAuth Capture		
				String [] info = getCodes(test.getResponse());
				String two[] = {"23", "23", info[2], "1.08", "1.08", "", info[0], info[3]};
				
				test = new Response(2, two);
				
				System.out.println(test.getXML());
				System.out.println(test.getResponse());
				System.out.println("____________________________________________");
				
				//Reversal Voidsale
				String [] info2 = getCodes(test.getResponse());
				
				String three[] = {"23", info2[1], "POS BRAVO v1.0", info2[2], "1.08", info2[3], info2[4], info2[0], "merchantID1" };

				test = new Response(3, three);
				
				System.out.println(test.getXML());
				System.out.println(test.getResponse());
				System.out.println("____________________________________________");
				
				//Standard Voidsale
		
				test = new Response(5, three);
				
				System.out.println(test.getXML());
				System.out.println(test.getResponse());
				System.out.println("____________________________________________");
*/
	
/*
 		//Testing for Card Present(Swiped) Sale
		String card = "0~IPAD100KB|24~98AC18281702140C|1~33|2~8388ED97A523FCCF909C5A8A21AB0253386326EEEE7557060C480624184D99956F7D5CB5697F9DA1E2213B2C0B3C1F0B83EC627718FAF629|3~82EFB6A5ECE71AB0710CABB5313910CB976A7048859723A01ACE85C2A19D42AE9BF1B5ABD18B3D44|4~|6~%M4005550000000480^MANUAL ENTRY/^1512000000000000000?|7~;4005550000000480=1512000000000000?|8~|9~00000000|10~000001|11~9500030000081C2000C6|12~00000000|"				;
		Pattern pregex = Pattern.compile("3~.*\\|4");
		Matcher m = pregex.matcher(card);
		m.find();
		System.out.println(m.group());
		Pattern pregex1 = Pattern.compile("11~.*\\|12");
		Matcher m1 = pregex1.matcher(card);
		m1.find();
		
				//Sale
				String yuk[] = {"25", "25", "POS BRAVO v1.0", card.substring(m1.start()+3, m1.end()-3), card.substring(m.start()+2, m.end()-2), "2.02", "123", "4 Corporate SQ", "30329"};

				Response test = new Response(6, yuk);

				System.out.println(test.getXML());
				System.out.println(test.getResponse());
				System.out.println("____________________________________________");

				//Reversal Voidsale
				String [] info2 = getCodes(test.getResponse());
				
				String three[] = {"25", info2[1], "POS BRAVO v1.0", info2[2], "2.02", info2[3], info2[4], info2[0], "merchantID1" };

				test = new Response(3, three);
				
				System.out.println(test.getXML());
				System.out.println(test.getResponse());
				System.out.println("____________________________________________");


				//Standard Voidsale
		
				test = new Response(5, three);
				
				System.out.println(test.getXML());
				System.out.println(test.getResponse());
				System.out.println("____________________________________________");

				//Adjust
				String []adj = new String[]{"25", info2[1], "POS BRAVO v1.0", info2[2], "2.13", "2.13", "", info2[0], "merchantID1"};
				
				test = new Response(7, adj);

				System.out.println(test.getXML());
				System.out.println(test.getResponse());
				System.out.println("____________________________________________");
*/
	   if(true) return;

//--------------------------------------------------------------------------------------------
				
				/*
				test = new Response(5, three);
				
				System.out.println(test.getXML());
				System.out.println(test.getResponse());
				System.out.println("____________________________________________");
			    */
				/*test = new Response(5, three);
				
				System.out.println(test.getXML());
				System.out.println(test.getResponse());
				System.out.println("____________________________________________");
				*/
				/*
				Response.batch = true;
				String twel [] = {"BatchSummary", "merchantID1"};
				
				Response test3 = new Response(12, twel);
				System.out.println(test3.getXML());
				System.out.println(test3.getResponse());
				System.out.println("____________________________________________");
				*/
				if(true)return;
				
		/*String 
		if(true)return;*/
		
		String []one = new String[]{"000001", "000001", "POS BRAVO v1.0", "6050110010027251161", "100.00", "Issue"};
		
		Response test1 = new Response(11, one);
		System.out.println(test1.getXML());
		System.out.println(test1.getResponse());
		System.out.println("____________________________________________");
		
		
		
		if(true)return;
		
		//adjust tips
		/*
		test = new Response(2, two);
		System.out.println(test.getXML());
		System.out.println(test.getResponse());

		ref = getRefcode(test.getResponse());
		System.out.println("____________________________________________");
		*///void
		/*test = new Response(3, three);
		System.out.println(test.getXML());
		System.out.println(test.getResponse());
		System.out.println("____________________________________________");*/
		//encrypted cc with magtek ipad 100kb
		/*test = new Response(4, four);
		System.out.println(test.getXML());
		System.out.println(test.getResponse());
		System.out.println("____________________________________________");*/
		
		//adjust
	/*	String sev[] = {"0001", ref, "POS BRAVO v1.0", "KqaoIkv1k9wUbUmJ9wmtTKFWZhyPMas0IhESEAAjEAeDBw==", "0.05", "KfJ", "|15|410100700000", "VI0105", "395347306=TOKEN", "0.05", "1.00"};
		
		test = new Response(7, sev);
		System.out.println(test.getXML());
		System.out.println(test.getResponse());
		System.out.println("____________________________________________");
		
		//standard voidsale
		String fiv[] = {"0001", ref, "POS BRAVO v1.0", "KqaoIkv1k9wUbUmJ9wmtTKFWZhyPMas0IhESEAAjEAeDBw==", "1.05", "KfJ", "|15|410100700000", "VI0105", "395347306=TOKEN", "1.05"};
		
		test = new Response(5, fiv);
		System.out.println(test.getXML());
		System.out.println(test.getResponse());

		String eigh[] = {"10", "10", "POS BRAVO v1.0", "4003000123456781", "1215", "1.05", "1.00", "", "", ""};
		
		test = new Response(8, eigh);
		System.out.println(test.getXML());
		System.out.println(test.getResponse());
		ref = getRefcode(test.getResponse());
		
		String nine[] = {"10", ref, "POS BRAVO v1.0", "KqaoIkv1k9wUbUmJ9wmtTKFWZhyPMas0IhESEAAjEAeDBw==", "1.05", "KfJ", "|15|410100700000", "VI0105", "merchantID1"};
		
		test = new Response(9, nine);
		System.out.println(test.getXML());
		System.out.println(test.getResponse());
		*/

	}
	public static String [] getCodes(String xml) {
		
		
		Scanner reader = null;
		Scanner regex = null;
		String code[] = new String[5];

		
		
			reader = new Scanner(xml);
	
		while (reader.hasNextLine()) {
			String read = reader.nextLine();
			regex = new Scanner(read);
            if (read.contains("AuthCode")) {
            	String temp = null;
				temp = regex
						.findInLine("<AuthCode>[\\da-zA-Z]*</AuthCode>");
				temp = temp.substring("<AuthCode>".length(),
						temp.length() - "</AuthCode>".length());
				code[0] = temp;
            }
            else if (read.contains("RefNo")) {
            	String temp = null;
        				temp = regex
        						.findInLine("<RefNo>[\\da-zA-Z]+</RefNo>");
        				temp = temp.substring("<RefNo>".length(),
        						temp.length() - "</RefNo>".length());
        				code[1] = temp;
                    }
            else if (read.contains("RecordNo")) {
            	String temp = null;
        				temp = regex
        						.findInLine("<RecordNo>.*</RecordNo>");
        				temp = temp.substring("<RecordNo>".length(),
        						temp.length() - "</RecordNo>".length());
        				code[2] = temp;
                    }
            else if (read.contains("AcqRefData")) {
            	String temp = null;
        				temp = regex
        						.findInLine("<AcqRefData>[\\da-zA-Z ]+</AcqRefData>");
        				temp = temp.substring("<AcqRefData>".length(),
        						temp.length() - "</AcqRefData>".length());
        				code[3] = temp;
                    }
            else if (read.contains("ProcessData")) {
            	String temp = null;
        				temp = regex
        						.findInLine("<ProcessData>[\\da-zA-Z |]+</ProcessData>");
        				temp = temp.substring("<ProcessData>".length(),
        						temp.length() - "</ProcessData>".length());
        				code[4] = temp;
                    }
            
            
					regex.close();
		}
		return code;
	}
	public static String getRefcode(String xml) {
	
	
		Scanner reader = new Scanner(xml);
		Scanner regex = null;
		String temp = null;

		
	
	
		while (reader.hasNextLine()) {
			String read = reader.nextLine();
			regex = new Scanner(read);
            if (read.contains("RefNo")) {
				temp = regex
						.findInLine("<RefNo>[\\da-zA-Z]+</RefNo>");
				temp = temp.substring("<RefNo>".length(),
						temp.length() - "</RefNo>".length());
				
            }
            
		}
		reader.close();
		
		return temp;
	}
	
}
