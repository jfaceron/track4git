package org.ssglobal.training.codes;

import java.util.ArrayList;
import java.util.List;

public class Analytics {
	public List<Money> getMoney(){
		String sql = "SELECT * FROM money";
		//Statement stmt = conn.createStatement();
		//ResultSet result = stmt.executeQuery(sql);
		//while(result.next()){
		// Money m = new Money();
		// m.add(result.getString("curr"));
		// m.add(result.getDouble("val"));
		// moneys.add(m);
		//}
		return null;
		}
		public List<String> getAllCurrency(){
		List<Money> moonies = getMoney();



		List<String> currencies = new ArrayList<>();
		for(Money lookup: moonies){
		currencies.add(lookup.getCurrency());
		}
		return currencies;
		}
		
		public double totalAmount(){
			List<Money> moonies = getMoney();
			double total = 0.0;
			for(Money lookup: moonies){
			total += lookup.getAmount();
			}
			return total;
		}
}
