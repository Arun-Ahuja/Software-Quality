public class DateObj
 {	
private int year;
private int month;	
private int day;	
private int[] monthLengths = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

private boolean leap;
public DateObj(int year, int month, int day)
 {		
this.year = year;		
this.month = month;
this.day = day;	
validate();	
}	
public DateObj nextDate() 
{	
	// date changes with valid date
if(this.day<this.monthLengths[this.month-1])
{
return new DateObj(this.year,this.month,this.day+1); // if days is greater than the monthLengths, then increase the day to the next day.
}
if(this.month>=12 ) // year changes
{
return new DateObj(this.year+1,1,1);
}
if(this.day ==this.monthLengths[this.month-1]) // changes in months, this will create error when I try to put assertEquals values.
												// this effect other values and not give null.
{
int newmonths = this.month%12;
newmonths = newmonths+1;
return new DateObj(this.year,newmonths,1);
}
else
return null;
// TODO: return the next valid date after this one
	
}	
public boolean isLeapYear() 
{
	leap = false;
	if(year%4 ==0) {
		if(year%100 ==0) {
			if(year%400==0)
				leap = true;
			else
				leap = false;
	}
		else
			leap = true;
	}
	else
		leap = false;
	if(leap)
		System.out.println(year + "is leap year"); // this show if year is leap, it will print leap year
	else
		System.out.println(year + "is not leap year"); // this show if year is not leap. it will print not leap year
	return leap;
}

@Override
public String toString() 
{		// format of the string
return String.format("Date[year: %d, month: %d, day: %d]", year, month, day);	
}	
private void validate()
 {	
	boolean b = isLeapYear();
	if(this.month>0 && this.month<=12)
{
	if(this.day>0 && this.day>=monthLengths[month-1])
	{
		System.out.println("valid Date"); // it will return with valid if date is valid
	}
else
{
			System.out.println("Invalid Date");  // it will return with invalid if date is invalid
}
	}
	else
		{
			System.out.println("Invalid month");  // return with invalid month if month is not in range
		}	
// TODO: throw an exception if the current values of year, month and day do not		
//       make a valid date
}
}