public class DateClass
	{ 
		private int day, month, year;
	//CONSTRUCTORS:
	//Default:
	// IMPORT: none
	// EXPORT: address of new DateClass object
	// Assertion:1st Jan 2000 is a suitable default date.
	public DateClass()
		{ 
			day = 1;
			month = 1;
			year = 2000;
		}
	// Alternate Constructor #1:
	// IMPORT inDay, inMonth, inYear
	// EXPORT address of new DateClass object.
	// Assertion: n/a
	public DateClass( int inDay, int inMonth, int inYear)
		{
			day = 1;
			month =1;
			year = 2000;
			setDate(inDay, inMonth, inYear);
		}

	// Alternate Constructor #2:
	// IMPORT inDate (DateClass object)
	// EXPORT address of new DateClass object.
	// Assertion:No validation of date contained in
	// inDate is required.
	public DateClass( DateClass inDate)
	{
		day = inDate.getDay();
		month = inDate.getMonth();
		year = inDate.getYear();
	}

	// OTHER PUBLIC Sub Modules:
	// Mutator setDate:
	// IMPORT inDay, inMonth inYear
	// EXPORT nothing
	// Assertion: n/a
	public void setDate( int inDay, int inMonth, int inYear)
	{
		if (isValidDate( inDay, inMonth, inYear))
		{
			day = inDay;
			month = inMonth;
			year = inYear;
		}
	}

	// Mutator setDate:
	// IMPORT inDate (DateClass object)
	// EXPORT nothing
	// Assertion:No validation of date contained in
	// inDate is required.
	public void setDate( DateClass inDate)
	{
		day = inDate.getDay();
		month = inDate.getMonth();
		year = inDate.getYear();
	}

	// Accessor getDay:
	// IMPORT: nothing
	// EXPORT: day
	public int getDay()
	{
		return day;
	}

	// Accessor getMonth:
	// IMPORT: nothing
	// EXPORT: month
	public int getMonth()
	{
		return month;
	}

	// Accessor getYear:
	// IMPORT: nothing
	// EXPORT: year

	public int getYear()
	{
		return year;
	}

	// Accessor toString:
	// IMPORT: nothing
	// EXPORT: dateStr
	// Assertion: date format is dayth month year

	public String toString()
	{
		String dateStr;
		dateStr = new String( day + calcDaySuffix(day) + " " + getMonthName(month) + " " + year);
		return dateStr;
	}

	public String toCSV()
	{
		String csvString;
		csvString = new String( day + calcDaySuffix(day) + ", " + getMonthName(month) + ", " + year);
		return csvString;
	}

	//Accessor yankDate:
	// IMPORT: nothing
	// EXPORT: dateStr
	// Assertion: date format is month dayth year
	public String yankDate()
	{
		return new String(getMonthName(month) + " " + day + calcDaySuffix(day) + " " + year);
	}

	// Accessor equals:
	// IMPORT: inDay, inMonth, inYear
	// EXPORT: isEqual
	// Assertion:two dates are the same if they have the
	// same day, month and year.

	public boolean equals( int inDay, int inMonth, int inYear)
	{
		boolean isEqual;
		isEqual = ((day == inDay) && (month == inMonth) && (year == inYear));
		return isEqual;
	}

	// Accessor equals:
	// IMPORT: inDate (DateClass object)
	// EXPORT: isEqual
	// Assertion:two dates are the same if they have
	// the same day, month and year.

	public boolean equals( DateClass inDate)
	{
		boolean isEqual;
		isEqual = ((day == inDate.getDay()) && (month == inDate.getMonth()) && (year == inDate.getYear()));
		return isEqual;
	}

	// PRIVATE sub modules:
	// isValidDate
	// IMPORT: day, month, year
	// EXPORT: validDate
	// Assertion: A date is valid if day/month within
	// range and year is in this century.

	private boolean isValidDate(int day, int month, int year)
	{
		boolean validDate = false;
		if (( 2000 <= year ) && ( year <= 3000 ))
		if (( 1 <= month ) && ( month <= 12 ))
		if (( 1 <= day ) && ( day <= daysInMonth( month, year)))
		validDate = true;
		return validDate;
	}

	// daysInMonth
	// IMPORT: month and year
	// EXPORT: numDays
	// Assertion: numDays will be the correct number of
	// days in month only if month and year
	// are valid.

	private int daysInMonth( int month, int year)
	{
		int numDays;
		if (( month == 4 ) || ( month == 6 ) || ( month == 9 ) || ( month == 11 ))
			numDays = 30;
		else if (( month == 1 ) || ( month == 3 ) || ( month == 5 ) || ( month == 7 ) || ( month == 8 ) || ( month == 10 ) || ( month == 12 ))
			numDays = 31;
		else if (isLeapYear( year))
			numDays = 29;
		else
			numDays = 28;
		return numDays;
	}

	private boolean isLeapYear( int year)
	{
		boolean isLeap;
		isLeap = (( year % 4 == 0 ) && (!(( year % 100 == 0 ) && ( year % 400 != 0 ))));
		return isLeap;
	}

	// calcDaySuffix
	// IMPORT: day
	// EXPORT: daySuffix
	// Assertion: suffix will be valid if day is valid.

	private String calcDaySuffix( int day)
	{
		String daySuffix;
		if (( day == 1 ) || ( day == 21 ) || ( day == 31 ))
			daySuffix = new String( "st");
		else if (( day == 2 ) || ( day == 22 ))
			daySuffix = new String( "nd");
		else if (( day == 3 ) || ( day == 23 ))
			daySuffix = new String( "rd");
		else // assertion: all other days use th
			daySuffix = new String( "th");
		return daySuffix;
	}

	// getMonthName
	// IMPORT: month
	// EXPORT: monthName
	// Assertion:if month valid (i.e. 1 to 12) then
	// monthName valid
	private String getMonthName( int month)
	{
		String monthName= new String("");
		switch( month)
		{
			case 1: monthName = new String("January");
				break;
		case 2: monthName = new String("February");
				break;
		case 3: monthName = new String("March");
				break;
		case 4: monthName = new String("April");
				break;
		case 5: monthName = new String("May");
				break;
		case 6: monthName = new String("June");
				break;
		case 7: monthName = new String("July");
				break;
		case 8: monthName = new String("August");
				break;
		case 9: monthName = new String("September");
				break;
		case 10: monthName = new String("October");
				break;
		case 11: monthName = new String("November");
				break;
		case 12: monthName = new String("December");
				break;
		}
		return monthName;
	}
}