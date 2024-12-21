package app.netlify.sachin1008.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import app.netlify.sachin1008.service.OptionService;

@Service
public class OptionServiceImpl implements OptionService{

	@Override
	public InlineKeyboardMarkup getOptionIndustriesBussiness() {
		 InlineKeyboardMarkup keyboardMarkup = new InlineKeyboardMarkup();
	     List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();

	  // Row 1
	     List<InlineKeyboardButton> row1 = new ArrayList<>();
	     InlineKeyboardButton i1 = new InlineKeyboardButton();
	     i1.setText("Agriculture");
	     i1.setCallbackData("Agriculture");
	     row1.add(i1);
	     InlineKeyboardButton i2 = new InlineKeyboardButton();
	     i2.setText("Retail");
	     i2.setCallbackData("Retail");
	     row1.add(i2);
	     keyboard.add(row1);

	     // Row 2
	     List<InlineKeyboardButton> row2 = new ArrayList<>();
	     InlineKeyboardButton i3 = new InlineKeyboardButton();
	     i3.setText("Wholesale");
	     i3.setCallbackData("Wholesale");
	     row2.add(i3);
	     InlineKeyboardButton i4 = new InlineKeyboardButton();
	     i4.setText("Manufacturing");
	     i4.setCallbackData("Manufacturing");
	     row2.add(i4);
	     keyboard.add(row2);

	     // Row 3
	     List<InlineKeyboardButton> row3 = new ArrayList<>();
	     InlineKeyboardButton i5 = new InlineKeyboardButton();
	     i5.setText("Construction");
	     i5.setCallbackData("Construction");
	     row3.add(i5);
	     InlineKeyboardButton i6 = new InlineKeyboardButton();
	     i6.setText("Technology");
	     i6.setCallbackData("Technology");
	     row3.add(i6);
	     keyboard.add(row3);

	     // Row 4
	     List<InlineKeyboardButton> row4 = new ArrayList<>();
	     InlineKeyboardButton i7 = new InlineKeyboardButton();
	     i7.setText("Finance & Insurance");
	     i7.setCallbackData("Finance & Insurance");
	     row4.add(i7);
	     InlineKeyboardButton i8 = new InlineKeyboardButton();
	     i8.setText("Health & Wellness");
	     i8.setCallbackData("Health & Wellness");
	     row4.add(i8);
	     keyboard.add(row4);

	     // Row 5
	     List<InlineKeyboardButton> row5 = new ArrayList<>();
	     InlineKeyboardButton i9 = new InlineKeyboardButton();
	     i9.setText("Professional Services");
	     i9.setCallbackData("Professional Services");
	     row5.add(i9);
	     InlineKeyboardButton i10 = new InlineKeyboardButton();
	     i10.setText("Education");
	     i10.setCallbackData("Education");
	     row5.add(i10);
	     keyboard.add(row5);

	     // Row 6
	     List<InlineKeyboardButton> row6 = new ArrayList<>();
	     InlineKeyboardButton i11 = new InlineKeyboardButton();
	     i11.setText("Transportation & Logistics");
	     i11.setCallbackData("Transportation & Logistics");
	     row6.add(i11);
	     InlineKeyboardButton i12 = new InlineKeyboardButton();
	     i12.setText("Entertainment & Media");
	     i12.setCallbackData("Entertainment & Media");
	     row6.add(i12);
	     keyboard.add(row6);

	     // Row 7
	     List<InlineKeyboardButton> row7 = new ArrayList<>();
	     InlineKeyboardButton i13 = new InlineKeyboardButton();
	     i13.setText("Hospitality");
	     i13.setCallbackData("Hospitality");
	     row7.add(i13);
	     InlineKeyboardButton i14 = new InlineKeyboardButton();
	     i14.setText("Real Estate");
	     i14.setCallbackData("Real Estate");
	     row7.add(i14);
	     keyboard.add(row7);

	     // Row 8
	     List<InlineKeyboardButton> row8 = new ArrayList<>();
	     InlineKeyboardButton i15 = new InlineKeyboardButton();
	     i15.setText("Energy & Utilities");
	     i15.setCallbackData("Energy & Utilities");
	     row8.add(i15);
	     InlineKeyboardButton i16 = new InlineKeyboardButton();
	     i16.setText("Retail Services");
	     i16.setCallbackData("Retail Services");
	     row8.add(i16);
	     keyboard.add(row8);

	     // Row 9
	     List<InlineKeyboardButton> row9 = new ArrayList<>();
	     InlineKeyboardButton i17 = new InlineKeyboardButton();
	     i17.setText("Food & Beverage");
	     i17.setCallbackData("Food & Beverage");
	     row9.add(i17);
	     InlineKeyboardButton i18 = new InlineKeyboardButton();
	     i18.setText("Government & Public Administration");
	     i18.setCallbackData("Government & Public Administration");
	     row9.add(i18);
	     keyboard.add(row9);

	     // Row 10
	     List<InlineKeyboardButton> row10 = new ArrayList<>();
	     InlineKeyboardButton i19 = new InlineKeyboardButton();
	     i19.setText("Nonprofit Organizations");
	     i19.setCallbackData("Nonprofit Organizations");
	     row10.add(i19);
	     InlineKeyboardButton i20 = new InlineKeyboardButton();
	     i20.setText("Other");
	     i20.setCallbackData("Other");
	     row10.add(i20);
	     keyboard.add(row10);

	     // Set the keyboard to the message
	     keyboardMarkup.setKeyboard(keyboard);
	     return keyboardMarkup;
	}

	@Override
	public InlineKeyboardMarkup getOptionBussinessObjective(String Bussiness) {
		InlineKeyboardMarkup keyboardMarkup = new InlineKeyboardMarkup();
	     List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
		switch (Bussiness) {
		case "Agriculture": {
	        // Agriculture
	        List<InlineKeyboardButton> row1 = new ArrayList<>();
	        InlineKeyboardButton i1 = new InlineKeyboardButton();
	        i1.setText("Farming (crop production, livestock)");
	        i1.setCallbackData("Farming (crop production, livestock)");
	        row1.add(i1);
	        
	        InlineKeyboardButton i2 = new InlineKeyboardButton();
	        i2.setText("Fishing");
	        i2.setCallbackData("Fishing");
	        row1.add(i2);
	        
	        keyboard.add(row1); // Add row 1 to keyboard

	        // Row 2
	        List<InlineKeyboardButton> row2 = new ArrayList<>();
	        InlineKeyboardButton i3 = new InlineKeyboardButton();
	        i3.setText("Forestry");
	        i3.setCallbackData("Forestry");
	        row2.add(i3);
	        
	        InlineKeyboardButton i4 = new InlineKeyboardButton();
	        i4.setText("Agricultural Equipment");
	        i4.setCallbackData("Agricultural Equipment");
	        row2.add(i4);
	        
	        keyboard.add(row2); // Add row 2 to keyboard
	        break;
	    }
	    case "Retail": {
	        // Retail
	        List<InlineKeyboardButton> row1 = new ArrayList<>();
	        InlineKeyboardButton i1 = new InlineKeyboardButton();
	        i1.setText("Online Retail (e-commerce)");
	        i1.setCallbackData("Online Retail (e-commerce)");
	        row1.add(i1);
	        
	        InlineKeyboardButton i2 = new InlineKeyboardButton();
	        i2.setText("Brick-and-Mortar Retail (physical stores)");
	        i2.setCallbackData("Brick-and-Mortar Retail");
	        row1.add(i2);
	        
	        keyboard.add(row1); // Add row 1 to keyboard

	        // Row 2
	        List<InlineKeyboardButton> row2 = new ArrayList<>();
	        InlineKeyboardButton i3 = new InlineKeyboardButton();
	        i3.setText("Specialty Stores (e.g., electronics, clothing)");
	        i3.setCallbackData("Specialty Stores");
	        row2.add(i3);
	        
	        InlineKeyboardButton i4 = new InlineKeyboardButton();
	        i4.setText("Supermarkets/Grocery Stores");
	        i4.setCallbackData("Supermarkets/Grocery Stores");
	        row2.add(i4);
	        
	        keyboard.add(row2); // Add row 2 to keyboard
	        
	        // Row 3
	        List<InlineKeyboardButton> row3 = new ArrayList<>();
	        InlineKeyboardButton i5 = new InlineKeyboardButton();
	        i5.setText("Department Stores");
	        i5.setCallbackData("Department Stores");
	        row3.add(i5);
	        
	        InlineKeyboardButton i6 = new InlineKeyboardButton();
	        i6.setText("Discount Stores");
	        i6.setCallbackData("Discount Stores");
	        row3.add(i6);
	        
	        keyboard.add(row3); // Add row 3 to keyboard
	        break;
	    }
	    case "Wholesale": {
	        // Wholesale
	        List<InlineKeyboardButton> row1 = new ArrayList<>();
	        InlineKeyboardButton i1 = new InlineKeyboardButton();
	        i1.setText("Product Distributors");
	        i1.setCallbackData("Product Distributors");
	        row1.add(i1);
	        
	        InlineKeyboardButton i2 = new InlineKeyboardButton();
	        i2.setText("Import/Export Businesses");
	        i2.setCallbackData("Import/Export Businesses");
	        row1.add(i2);
	        
	        keyboard.add(row1); // Add row 1 to keyboard

	        // Row 2
	        List<InlineKeyboardButton> row2 = new ArrayList<>();
	        InlineKeyboardButton i3 = new InlineKeyboardButton();
	        i3.setText("Wholesale Trade");
	        i3.setCallbackData("Wholesale Trade");
	        row2.add(i3);
	        
	        keyboard.add(row2); // Add row 2 to keyboard
	        break;
	    }
	    case "Manufacturing": {
	        // Manufacturing
	        List<InlineKeyboardButton> row1 = new ArrayList<>();
	        InlineKeyboardButton i1 = new InlineKeyboardButton();
	        i1.setText("Food & Beverage Manufacturing");
	        i1.setCallbackData("Food & Beverage Manufacturing");
	        row1.add(i1);
	        
	        InlineKeyboardButton i2 = new InlineKeyboardButton();
	        i2.setText("Textile Manufacturing");
	        i2.setCallbackData("Textile Manufacturing");
	        row1.add(i2);
	        
	        keyboard.add(row1); // Add row 1 to keyboard

	        // Row 2
	        List<InlineKeyboardButton> row2 = new ArrayList<>();
	        InlineKeyboardButton i3 = new InlineKeyboardButton();
	        i3.setText("Automobile Manufacturing");
	        i3.setCallbackData("Automobile Manufacturing");
	        row2.add(i3);
	        
	        InlineKeyboardButton i4 = new InlineKeyboardButton();
	        i4.setText("Electronics Manufacturing");
	        i4.setCallbackData("Electronics Manufacturing");
	        row2.add(i4);
	        
	        keyboard.add(row2); // Add row 2 to keyboard

	        // Row 3
	        List<InlineKeyboardButton> row3 = new ArrayList<>();
	        InlineKeyboardButton i5 = new InlineKeyboardButton();
	        i5.setText("Chemical Manufacturing");
	        i5.setCallbackData("Chemical Manufacturing");
	        row3.add(i5);
	        
	        InlineKeyboardButton i6 = new InlineKeyboardButton();
	        i6.setText("Pharmaceutical Manufacturing");
	        i6.setCallbackData("Pharmaceutical Manufacturing");
	        row3.add(i6);
	        
	        keyboard.add(row3); // Add row 3 to keyboard

	        // Row 4
	        List<InlineKeyboardButton> row4 = new ArrayList<>();
	        InlineKeyboardButton i7 = new InlineKeyboardButton();
	        i7.setText("Furniture Manufacturing");
	        i7.setCallbackData("Furniture Manufacturing");
	        row4.add(i7);
	        
	        InlineKeyboardButton i8 = new InlineKeyboardButton();
	        i8.setText("Packaging Manufacturing");
	        i8.setCallbackData("Packaging Manufacturing");
	        row4.add(i8);
	        
	        keyboard.add(row4); // Add row 4 to keyboard
	        break;
	    }
	    case "Construction": {
	        // Construction
	        List<InlineKeyboardButton> row1 = new ArrayList<>();
	        InlineKeyboardButton i1 = new InlineKeyboardButton();
	        i1.setText("Residential Construction");
	        i1.setCallbackData("Residential Construction");
	        row1.add(i1);
	        
	        InlineKeyboardButton i2 = new InlineKeyboardButton();
	        i2.setText("Commercial Construction");
	        i2.setCallbackData("Commercial Construction");
	        row1.add(i2);
	        
	        keyboard.add(row1); // Add row 1 to keyboard

	        // Row 2
	        List<InlineKeyboardButton> row2 = new ArrayList<>();
	        InlineKeyboardButton i3 = new InlineKeyboardButton();
	        i3.setText("Industrial Construction");
	        i3.setCallbackData("Industrial Construction");
	        row2.add(i3);
	        
	        InlineKeyboardButton i4 = new InlineKeyboardButton();
	        i4.setText("Heavy Civil Construction (infrastructure projects)");
	        i4.setCallbackData("Heavy Civil Construction");
	        row2.add(i4);
	        
	        keyboard.add(row2); // Add row 2 to keyboard

	        // Row 3
	        List<InlineKeyboardButton> row3 = new ArrayList<>();
	        InlineKeyboardButton i5 = new InlineKeyboardButton();
	        i5.setText("Building Materials");
	        i5.setCallbackData("Building Materials");
	        row3.add(i5);
	        
	        keyboard.add(row3); // Add row 3 to keyboard
	        break;
	    }
	    case "Technology": {
	        // Technology
	        List<InlineKeyboardButton> row1 = new ArrayList<>();
	        InlineKeyboardButton i1 = new InlineKeyboardButton();
	        i1.setText("Software Development");
	        i1.setCallbackData("Software Development");
	        row1.add(i1);
	        
	        InlineKeyboardButton i2 = new InlineKeyboardButton();
	        i2.setText("Hardware Manufacturing");
	        i2.setCallbackData("Hardware Manufacturing");
	        row1.add(i2);
	        
	        keyboard.add(row1); // Add row 1 to keyboard

	        // Row 2
	        List<InlineKeyboardButton> row2 = new ArrayList<>();
	        InlineKeyboardButton i3 = new InlineKeyboardButton();
	        i3.setText("Information Technology Services (IT Support, Managed Services)");
	        i3.setCallbackData("IT Services");
	        row2.add(i3);
	        
	        InlineKeyboardButton i4 = new InlineKeyboardButton();
	        i4.setText("Cybersecurity");
	        i4.setCallbackData("Cybersecurity");
	        row2.add(i4);
	        
	        keyboard.add(row2); // Add row 2 to keyboard

	        // Row 3
	        List<InlineKeyboardButton> row3 = new ArrayList<>();
	        InlineKeyboardButton i5 = new InlineKeyboardButton();
	        i5.setText("Artificial Intelligence (AI) and Machine Learning");
	        i5.setCallbackData("AI and Machine Learning");
	        row3.add(i5);
	        
	        InlineKeyboardButton i6 = new InlineKeyboardButton();
	        i6.setText("Cloud Computing");
	        i6.setCallbackData("Cloud Computing");
	        row3.add(i6);
	        
	        keyboard.add(row3); // Add row 3 to keyboard

	        // Row 4
	        List<InlineKeyboardButton> row4 = new ArrayList<>();
	        InlineKeyboardButton i7 = new InlineKeyboardButton();
	        i7.setText("Telecommunications");
	        i7.setCallbackData("Telecommunications");
	        row4.add(i7);
	        
	        keyboard.add(row4); // Add row 4 to keyboard
	        break;
	    }
	    case "Finance & Insurance": {
	        // Finance & Insurance
	        List<InlineKeyboardButton> row1 = new ArrayList<>();
	        InlineKeyboardButton i1 = new InlineKeyboardButton();
	        i1.setText("Banking (Commercial Banks, Investment Banks)");
	        i1.setCallbackData("Banking");
	        row1.add(i1);
	        
	        InlineKeyboardButton i2 = new InlineKeyboardButton();
	        i2.setText("Credit Unions");
	        i2.setCallbackData("Credit Unions");
	        row1.add(i2);
	        
	        keyboard.add(row1); // Add row 1 to keyboard

	        // Row 2
	        List<InlineKeyboardButton> row2 = new ArrayList<>();
	        InlineKeyboardButton i3 = new InlineKeyboardButton();
	        i3.setText("Investment Firms");
	        i3.setCallbackData("Investment Firms");
	        row2.add(i3);
	        
	        InlineKeyboardButton i4 = new InlineKeyboardButton();
	        i4.setText("Insurance Companies (Life, Health, Property, Casualty)");
	        i4.setCallbackData("Insurance Companies");
	        row2.add(i4);
	        
	        keyboard.add(row2); // Add row 2 to keyboard

	        // Row 3
	        List<InlineKeyboardButton> row3 = new ArrayList<>();
	        InlineKeyboardButton i5 = new InlineKeyboardButton();
	        i5.setText("Hedge Funds");
	        i5.setCallbackData("Hedge Funds");
	        row3.add(i5);
	        
	        InlineKeyboardButton i6 = new InlineKeyboardButton();
	        i6.setText("Venture Capital");
	        i6.setCallbackData("Venture Capital");
	        row3.add(i6);
	        
	        keyboard.add(row3); // Add row 3 to keyboard
	        break;
	    }
	    
	    // Continue for other cases like "Health & Wellness", "Education", etc.
	    default:
	        // Handle default case (if no industry matches)
	        break;
	}
		keyboardMarkup.setKeyboard(keyboard);
	     return keyboardMarkup;

	}

	@Override
	public InlineKeyboardMarkup getOptionCategory() {
		InlineKeyboardMarkup keyboardMarkup = new InlineKeyboardMarkup();
	     List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();

	        List<InlineKeyboardButton> row1 = new ArrayList<>();
	        InlineKeyboardButton i1 = new InlineKeyboardButton();
	        i1.setText("Children");
	        i1.setCallbackData("Children");
	        row1.add(i1);
	        
	        InlineKeyboardButton i2 = new InlineKeyboardButton();
	        i2.setText("Teens/Adolescents");
	        i2.setCallbackData("Teens/Adolescents");
	        row1.add(i2);
	        keyboard.add(row1);
	        List<InlineKeyboardButton> row2 = new ArrayList<>();
	        InlineKeyboardButton i3 = new InlineKeyboardButton();
	        i3.setText("Adults");
	        i3.setCallbackData("Adults");
	        row2.add(i3);
	        
	        InlineKeyboardButton i4 = new InlineKeyboardButton();
	        i4.setText("Seniors/Elderly");
	        i4.setCallbackData("Seniors/Elderly");
	        row2.add(i4);
	        keyboard.add(row2);
	        keyboardMarkup.setKeyboard(keyboard);
		     return keyboardMarkup;
	}

	@Override
	public InlineKeyboardMarkup getOptionLocation() {
		InlineKeyboardMarkup keyboardMarkup = new InlineKeyboardMarkup();
		List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();

		// Row 1
		List<InlineKeyboardButton> row1 = new ArrayList<>();
		InlineKeyboardButton i1 = new InlineKeyboardButton();
		i1.setText("Andhra Pradesh");
		i1.setCallbackData("Andhra Pradesh");
		row1.add(i1);
		InlineKeyboardButton i2 = new InlineKeyboardButton();
		i2.setText("Arunachal Pradesh");
		i2.setCallbackData("Arunachal Pradesh");
		row1.add(i2);
		keyboard.add(row1);

		// Row 2
		List<InlineKeyboardButton> row2 = new ArrayList<>();
		InlineKeyboardButton i3 = new InlineKeyboardButton();
		i3.setText("Assam");
		i3.setCallbackData("Assam");
		row2.add(i3);
		InlineKeyboardButton i4 = new InlineKeyboardButton();
		i4.setText("Bihar");
		i4.setCallbackData("Bihar");
		row2.add(i4);
		keyboard.add(row2);

		// Row 3
		List<InlineKeyboardButton> row3 = new ArrayList<>();
		InlineKeyboardButton i5 = new InlineKeyboardButton();
		i5.setText("Chhattisgarh");
		i5.setCallbackData("Chhattisgarh");
		row3.add(i5);
		InlineKeyboardButton i6 = new InlineKeyboardButton();
		i6.setText("Goa");
		i6.setCallbackData("Goa");
		row3.add(i6);
		keyboard.add(row3);

		// Row 4
		List<InlineKeyboardButton> row4 = new ArrayList<>();
		InlineKeyboardButton i7 = new InlineKeyboardButton();
		i7.setText("Gujarat");
		i7.setCallbackData("Gujarat");
		row4.add(i7);
		InlineKeyboardButton i8 = new InlineKeyboardButton();
		i8.setText("Haryana");
		i8.setCallbackData("Haryana");
		row4.add(i8);
		keyboard.add(row4);

		// Row 5
		List<InlineKeyboardButton> row5 = new ArrayList<>();
		InlineKeyboardButton i9 = new InlineKeyboardButton();
		i9.setText("Himachal Pradesh");
		i9.setCallbackData("Himachal Pradesh");
		row5.add(i9);
		InlineKeyboardButton i10 = new InlineKeyboardButton();
		i10.setText("Jharkhand");
		i10.setCallbackData("Jharkhand");
		row5.add(i10);
		keyboard.add(row5);

		// Row 6
		List<InlineKeyboardButton> row6 = new ArrayList<>();
		InlineKeyboardButton i11 = new InlineKeyboardButton();
		i11.setText("Karnataka");
		i11.setCallbackData("Karnataka");
		row6.add(i11);
		InlineKeyboardButton i12 = new InlineKeyboardButton();
		i12.setText("Kerala");
		i12.setCallbackData("Kerala");
		row6.add(i12);
		keyboard.add(row6);

		// Row 7
		List<InlineKeyboardButton> row7 = new ArrayList<>();
		InlineKeyboardButton i13 = new InlineKeyboardButton();
		i13.setText("Madhya Pradesh");
		i13.setCallbackData("Madhya Pradesh");
		row7.add(i13);
		InlineKeyboardButton i14 = new InlineKeyboardButton();
		i14.setText("Maharashtra");
		i14.setCallbackData("Maharashtra");
		row7.add(i14);
		keyboard.add(row7);

		// Row 8
		List<InlineKeyboardButton> row8 = new ArrayList<>();
		InlineKeyboardButton i15 = new InlineKeyboardButton();
		i15.setText("Manipur");
		i15.setCallbackData("Manipur");
		row8.add(i15);
		InlineKeyboardButton i16 = new InlineKeyboardButton();
		i16.setText("Meghalaya");
		i16.setCallbackData("Meghalaya");
		row8.add(i16);
		keyboard.add(row8);

		// Row 9
		List<InlineKeyboardButton> row9 = new ArrayList<>();
		InlineKeyboardButton i17 = new InlineKeyboardButton();
		i17.setText("Mizoram");
		i17.setCallbackData("Mizoram");
		row9.add(i17);
		InlineKeyboardButton i18 = new InlineKeyboardButton();
		i18.setText("Nagaland");
		i18.setCallbackData("Nagaland");
		row9.add(i18);
		keyboard.add(row9);

		// Row 10
		List<InlineKeyboardButton> row10 = new ArrayList<>();
		InlineKeyboardButton i19 = new InlineKeyboardButton();
		i19.setText("Odisha");
		i19.setCallbackData("Odisha");
		row10.add(i19);
		InlineKeyboardButton i20 = new InlineKeyboardButton();
		i20.setText("Punjab");
		i20.setCallbackData("Punjab");
		row10.add(i20);
		keyboard.add(row10);

		// Row 11
		List<InlineKeyboardButton> row11 = new ArrayList<>();
		InlineKeyboardButton i21 = new InlineKeyboardButton();
		i21.setText("Rajasthan");
		i21.setCallbackData("Rajasthan");
		row11.add(i21);
		InlineKeyboardButton i22 = new InlineKeyboardButton();
		i22.setText("Sikkim");
		i22.setCallbackData("Sikkim");
		row11.add(i22);
		keyboard.add(row11);

		// Row 12
		List<InlineKeyboardButton> row12 = new ArrayList<>();
		InlineKeyboardButton i23 = new InlineKeyboardButton();
		i23.setText("Tamil Nadu");
		i23.setCallbackData("Tamil Nadu");
		row12.add(i23);
		InlineKeyboardButton i24 = new InlineKeyboardButton();
		i24.setText("Telangana");
		i24.setCallbackData("Telangana");
		row12.add(i24);
		keyboard.add(row12);

		// Row 13
		List<InlineKeyboardButton> row13 = new ArrayList<>();
		InlineKeyboardButton i25 = new InlineKeyboardButton();
		i25.setText("Tripura");
		i25.setCallbackData("Tripura");
		row13.add(i25);
		InlineKeyboardButton i26 = new InlineKeyboardButton();
		i26.setText("Uttar Pradesh");
		i26.setCallbackData("Uttar Pradesh");
		row13.add(i26);
		keyboard.add(row13);

		// Row 14
		List<InlineKeyboardButton> row14 = new ArrayList<>();
		InlineKeyboardButton i27 = new InlineKeyboardButton();
		i27.setText("Uttarakhand");
		i27.setCallbackData("Uttarakhand");
		row14.add(i27);
		InlineKeyboardButton i28 = new InlineKeyboardButton();
		i28.setText("West Bengal");
		i28.setCallbackData("West Bengal");
		row14.add(i28);
		keyboard.add(row14);

		keyboardMarkup.setKeyboard(keyboard);

		return keyboardMarkup;
	}

	@Override
	public InlineKeyboardMarkup getOptionScrapingAndAI() {
		InlineKeyboardMarkup keyboardMarkup = new InlineKeyboardMarkup();
		List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();

		// Row 1
		List<InlineKeyboardButton> row1 = new ArrayList<>();
		InlineKeyboardButton i1 = new InlineKeyboardButton();
		i1.setText("show Ad Click In Different Industries");
		i1.setCallbackData("show Ad Click In Different Industries");
		row1.add(i1);
		List<InlineKeyboardButton> row2 = new ArrayList<>();
		InlineKeyboardButton i3 = new InlineKeyboardButton();
		i3.setText("AI");
		i3.setCallbackData("AI");
		row2.add(i3);
		keyboard.add(row1);
		keyboard.add(row2);
		keyboardMarkup.setKeyboard(keyboard);

		return keyboardMarkup;
	}
	
}
