package LevelProjects;

import java.util.Scanner;

public class BookYourBus {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("****************************************************");
		System.out.println("******!!!!!!  Welcome to bookuRBuss  !!!!!!!!******");
		System.out.println("****************************************************");
		System.out.println("Enter 1 for Proceed");
		System.out.println("Enter 2 for exit");
		System.out.println("****************************************************");
		System.out.println();
		int a=sc.nextInt();
		if (a==1)
		{
			System.out.println("************************************************");
			System.out.println("====  Enter the details for Registration  ===");
			System.out.println("");
			System.out.println("Enter the Name:");
			String name=sc.next();
			System.out.println("");
			System.out.println("Enter Mobile number:");
			long mobNo=sc.nextLong();
			long temp=mobNo;
			int count=0;
			{
				while (mobNo!=0)
			    {
					count++;
					mobNo=mobNo/10;
			    }
				if (count==10)
				{
			 System.out.println("Mobile number "+temp+" is valid");
			 System.out.println("");
			 System.out.println("Enter the e-mail Id:");
			 String mail=sc.next();
			 String temp1=mail;
			 System.out.println("");
			 System.out.println("Enter the User name:");
			 String user=sc.next();
			 String temp2=user;
			 System.out.println("");
			 System.out.println("Enter the Password:");
			 String password=sc.next();
			 System.out.println("");
			 System.out.println("Enter 1 for Register");
			 System.out.println("Enter 2 for Cancel");
			 System.out.println("************************************************");
			 System.out.println("");
			 int b=sc.nextInt();
			 if (b==1)
			 {
				System.out.println("************************************************");
			    System.out.println("===  Registration successful  ===");
			    System.out.println("********************************************");
				System.out.println("");
				System.out.println("===  Thanks for Registration  ===");
				System.out.println("");
				System.out.println("Enter 1 for login");
				System.out.println("Enter 2 for exit");
				System.out.println("***********************************************");
				System.out.println("");
				int c=sc.nextInt();
				if (c==1)
				{
					System.out.println("*******************************************");
					System.out.println("Enter the User name:");
					String nuser=sc.next();
			        System.out.println("");
			        System.out.println("Enter the Password:");
			        String npassword=sc.next();
			        System.out.println("");
					if (user.equals(nuser)&&password.equals(npassword))
					{
						System.out.println("***************************************");
						System.out.println("===  Login suceessful  ===");
						System.out.println("***************************************");
						System.out.println("");
						System.out.println("===  Book Tickets  ===");
						System.out.println("");
						System.out.println("Enter from place:");
						String fromPlace=sc.next();
						String temp6=fromPlace;
						System.out.println("");
						System.out.println("Enter to place:");
						String toPlace=sc.next();
						String temp7=toPlace;
						System.out.println("");
						System.out.println("Enter the Date:");
						String date=sc.next();
						String temp5=date;
						System.out.println("");
						System.out.println("*****************************************");
						System.out.println("===  Search Buses  ===");
						System.out.println("*****************************************");
						System.out.println("");
						System.out.println("Travels and Tours buses name:");
						String toursnt=sc.next();
						String temp16=toursnt;
						System.out.println("Enter 1 for tours and travels buses");
						System.out.println("Enter 2 for exit");
						System.out.println("");
						int d=sc.nextInt();
						switch(d)
						{
							case 1:
							{
								System.out.println("...Welcome to "+temp16+" tours and travels section...");
								System.out.println("");
								System.out.println("********R - Female seats*****************");
								System.out.println("********B - Male seats******************");
								System.out.println("********G - Selected seats*************");
								System.out.println("********Y - Resereved seats*************");
								System.out.println("********O - Blocked for social distancing seats");
								System.out.println("");
								System.out.println("************************************************");
								System.out.println("Enter 1 for Ticket booking");
								System.out.println("Enter 2 for exit");
								System.out.println("************************************************");
								System.out.println("");
								int g=sc.nextInt();
								if (g==1)
								{
									System.out.println("....Thanks for choosing Tickets booking....");
									System.out.println("");
									System.out.println("* * * * * * * * * * * * * * * * * * *  *");
									System.out.println("Total seats in Selected RTC Bus");
									System.out.println("");
									System.out.println("           Lower(22)  Upper(27)          ");
									System.out.println("");
									System.out.println("  (All Prices)  ( Rs/-A )  ( Rs/-B )  ");
									System.out.println("");
									System.out.println("                       [DS]  "); //driver seat//
									System.out.println("");
									System.out.println("     [R] [G]       [Y] [ ] [B]");
									System.out.println("     [ ] [ ]       [ ] [G] [ ]");
									System.out.println("     [ ] [Y]       [ ] [R] [ ]");
									System.out.println("     [B] [ ]       [ ] [ ] [Y]");
									System.out.println("     [ ] [G]       [ ] [B] [ ]");
									System.out.println("     [ ] [ ]       [Y] [ ] [R]");
									System.out.println("     [ ] [B]       [ ] [ ] [ ]");
									System.out.println("     [Y] [ ]       [ ] [G] [ ]");
									System.out.println("     [ ] [ ]       [ ] [ ] [B]");
									System.out.println("     [G] [ ]       [R] [ ] [Y]");
									System.out.println("");
									System.out.println("* * * * * * * * * * * * * * * * * * *");
									System.out.println("");
									System.out.println("Enter 1 for to book any seat");
									System.out.println("Enter 2 for exit");
									System.out.println("- - - - - - - - - - - - - - - - - - -");
									System.out.println("");
									int h=sc.nextInt();
									if (h==1)
									{
										System.out.println("");
										System.out.println("***** - - - You are choosen seat is Selected - - - - *****");
										System.out.println("");
										System.out.println("********Select Boarding & Dropping Points*******");
										System.out.println("");
										System.out.println("Select Boarding Point : ");
										String boarding=sc.next();
										String temp8=boarding;
										System.out.println("Boarding point time : ");
										String btime=sc.next();
										String temp9=btime;
										System.out.println("");
										System.out.println("*********Boarding point Selected***************");
										System.out.println("");
										System.out.println("Enter 1 for to FILL PASSENGER DETAILS :");
										System.out.println("Enter 2 for exit");
										System.out.println("");
										int i=sc.nextInt();
										if (i==1)
										{
											System.out.println("* * * * * * * * * * * * * * * * * *  *");
											System.out.println("Enter PASSENGER DETAILS");
											System.out.println("* * * * * * * * * * * * * * * * * * * *");
											System.out.println("");
											System.out.println(" -  -    Contact Details  -   -  ");
											System.out.println("");
											System.out.println("Email id: "+temp1);
											System.out.println("Phone: "+temp);
											System.out.println("");
											System.out.println("***************************************");
											System.out.println(" *  *  Passenger Information  *   *  ");
											System.out.println("");
											System.out.println("Passenger Name:");
											String pname=sc.next();
											String temp10=pname;
											System.out.println("Gender:");
											String gender=sc.next();
											String temp11=gender;
											System.out.println("Age:");
											int page=sc.nextInt();
											int temp12=page;
											int count2=0;
		                                 	{
			                                 	while (page!=0)
			                                    {
				                                   	count2++;
				                                 	page=page/10;
			                                    }
			                                	if (count2==1||count2==2)
												{
													System.out.println(temp12);
													System.out.println("");
													System.out.println(" * * * * * * * * * * * * * * * * * *");
													System.out.println("      UrbUS Assurance Program");
													System.out.println("* * * * * * * * * * * * * * * * * * ");
													System.out.println("");
													System.out.println("Enter 1. Yes,Protect my trip Rs/-22 (1 passenger),I agree to the Terms & Conditions");
													System.out.println("Enter 2. No,I would like to proceed without insurance");
													System.out.println("");
													int j=sc.nextInt();
													switch (j)
													{
													case 1:
														{
															System.out.println("************************");
															System.out.println("  We protected you...Your protection is our Safety:");
															System.out.println("************************");
															System.out.println("Enter 1 for continue booking");
															System.out.println("Enter 2 for exit");
															System.out.println("");
															int k=sc.nextInt();
															if (k==1)
															{
																System.out.println("    Continue Booking");
																System.out.println("");
																System.out.println("Charges in Rupees/- :");
																int charge=sc.nextInt();
																int temp15=charge;
																System.out.println("Select a Payment option:");
																System.out.println("");
																System.out.println("Enter 1 for Gpay");
																System.out.println("Enter 2 for PhonePay");
																System.out.println("Enter 3 for PayTm");
																System.out.println("Enter 4 for cash");
																System.out.println("");
																int l=sc.nextInt();
																switch (l)
																{
																case 1:
																	{
																	    System.out.println("");
																		System.out.println("Gpay:");
																		System.out.println("");
																		System.out.println(temp6+"    -->   "+temp7);
																		System.out.println(temp9+"   ----   "+temp5);
																		System.out.println("");
																		System.out.println("Enter OTP to complete the payment");
																		int otp=sc.nextInt();
																		int temp14=otp;
																		int count3=0;
																		{
																			while (otp!=0)
																			{
																				count3++;
																				otp=otp/10;
																			}
																			if (count3==4||count3==6)
																			{
																				System.out.println(temp14+" OTP is valid");
																				System.out.println("");
																				System.out.println("*******************************************");
																				System.out.println("         Payment successfully completed");
																				System.out.println("");
																				System.out.println("         You received 'BOOKurbuS' ticket ");
																				System.out.println("*******************************************");
																				System.out.println("");
																				System.out.println("Enter 1 for to view Mobile message");
																				System.out.println("Enter 2 for to view Mail message");
																				System.out.println("Enter 3 for Neglect (or) Exit");
																				System.out.println("");
																				int m=sc.nextInt();
																				if (m==1)
																				{
																					System.out.println("Mobile message:");
																					System.out.println("Passenger name: "+temp10);
																					System.out.println("Gender        : "+temp11);
																					System.out.println("Passenger Age : "+temp12);
																					System.out.println("Bus number    :IND22IN1999");
																					System.out.println("From place    : "+temp6);
																					System.out.println("To place      : "+temp7);
																					System.out.println("Boarding point: "+temp8);
																					System.out.println("Boarding time : "+temp9);
																					System.out.println("Dear "+temp10+", please see above");
																					System.out.println("details for your upcoming trip");
																					System.out.println("from "+temp6+" to "+temp7+"......");
																					System.out.println("");
																					System.out.println("               -Team BOOKurbuS");
																					System.out.println("");
																					System.out.println("*******************************");
																					System.out.println("Enter 1 for exit");
																					System.out.println("Enter 2 for to CANCEL the TICKET");
																					System.out.println("*******************************");
																					System.out.println("");
																					int n=sc.nextInt();
																					if (n==1)
																					{
																						System.out.println("_ - - _ Thank You_ - - _");
																					}
																					else if (n==2)
																					{
																						System.out.println("**************************");
																						System.out.println(" CANCELLATION TICKET");
																						System.out.println("");
																						System.out.println("Enter 1 for to cancel th ticket");
																						System.out.println("Enter 2 for to exit");
																						System.out.println("");
																						int o=sc.nextInt();
																						if (o==1)
																						{
																							System.out.println("");
																							System.out.println("Dear "+temp10+", we are regreting");
																					        System.out.println("to inform your upcoming trip from");
																					        System.out.println(temp6+" to "+temp7+" is CANCELLED");
																					        System.out.println("");
																					        System.out.println("               -Team BOOKurbuS");
																						}
																						else if (o==2)
																						{
																							System.out.println("Values are cancelled...Visit again");
																						}
																						else
																						{
																							System.out.println("Sorry...Invalid input(o)");
																						}
																					}
																					else
																					{
																						System.out.println("Sorry...invalid input(n)");
																					}
																				}
																				else if (m==2)
																				{
																					System.out.println("Mail message:");
																					System.out.println("Passenger name: "+temp10);
																					System.out.println("Gender        : "+temp11);
																					System.out.println("Passenger Age : "+temp12);
																					System.out.println("Bus number    :IND22IN1999");
																					System.out.println("From place    : "+temp6);
																					System.out.println("To place      : "+temp7);
																					System.out.println("Boarding point: "+temp8);
																					System.out.println("Boarding time : "+temp9);
																					System.out.println("Dear "+temp10+", please see above");
																					System.out.println("details for your upcoming trip");
																					System.out.println("from "+temp6+" to "+temp7+"......");
																					System.out.println("");
																					System.out.println("               -Team BOOKurbuS");
																					System.out.println("");
																					System.out.println("*******************************");
																					System.out.println("Enter 1 for exit");
																					System.out.println("Enter 2 for to CANCEL the TICKET");
																					System.out.println("*******************************");
																					System.out.println("");
																					int n=sc.nextInt();
																					if (n==1)
																					{
																						System.out.println("_ - - _ Thank You_ - - _");
																					}
																					else if (n==2)
																					{
																						System.out.println("**************************");
																						System.out.println(" CANCELLATION TICKET");
																						System.out.println("");
																						System.out.println("Enter 1 for to cancel th ticket");
																						System.out.println("Enter 2 for to exit");
																						System.out.println("");
																						int o=sc.nextInt();
																						if (o==1)
																						{
																							System.out.println("");
																							System.out.println("Dear "+temp10+", we are regreting");
																					        System.out.println("to inform your upcoming trip from");
																					        System.out.println(temp6+" to "+temp7+" is CANCELLED");
																					        System.out.println("");
																					        System.out.println("               -Team BOOKurbuS");
																						}
																						else if (o==2)
																						{
																							System.out.println("Values are cancelled...Visit again");
																						}
																						else
																						{
																							System.out.println("Sorry...Invalid input(o)");
																						}
																					}
																					else
																					{
																						System.out.println("Sorry...invalid input(n)");
																					}
																				}
																				else if (m==3)
																				{
																					System.out.println("");
																				}
																				else
																				{
																					System.out.println("Sorry...Invalid input(m)");
																				}
																			}
																			else
																			{
																				System.out.println("Sorry...OTP is invalid");
																			}
																		}
																	}break;
																case 2:
																	{
																		System.out.println("");
																		System.out.println("PhonePay:");
																		System.out.println("");
																		System.out.println(temp6+"    -->   "+temp7);
																		System.out.println(temp9+"   ----   "+temp5);
																		System.out.println("");
																		System.out.println("Enter OTP to complete the payment");
																		int otp=sc.nextInt();
																		int temp14=otp;
																		int count3=0;
																		{
																			while (otp!=0)
																			{
																				count3++;
																				otp=otp/10;
																			}
																			if (count3==4||count3==6)
																			{
																				System.out.println(temp14+" OTP is valid");
																				System.out.println("");
																				System.out.println("*******************************************");
																				System.out.println("         Payment successfully completed");
																				System.out.println("");
																				System.out.println("         You received 'BOOKurbuS' ticket ");
																				System.out.println("*******************************************");
																				System.out.println("");
																				System.out.println("Enter 1 for to view Mobile message");
																				System.out.println("Enter 2 for to view Mail message");
																				System.out.println("Enter 3 for Neglect (or) Exit");
																				System.out.println("");
																				int m=sc.nextInt();
																				if (m==1)
																				{
																					System.out.println("Mobile message:");
																					System.out.println("Passenger name: "+temp10);
																					System.out.println("Gender        : "+temp11);
																					System.out.println("Passenger Age : "+temp12);
																					System.out.println("Bus number    :IND22IN1999");
																					System.out.println("From place    : "+temp6);
																					System.out.println("To place      : "+temp7);
																					System.out.println("Boarding point: "+temp8);
																					System.out.println("Boarding time : "+temp9);
																					System.out.println("Dear "+temp10+", please see above");
																					System.out.println("details for your upcoming trip");
																					System.out.println("from "+temp6+" to "+temp7+"......");
																					System.out.println("");
																					System.out.println("               -Team BOOKurbuS");
																					System.out.println("");
																					System.out.println("*******************************");
																					System.out.println("Enter 1 for exit");
																					System.out.println("Enter 2 for to CANCEL the TICKET");
																					System.out.println("*******************************");
																					System.out.println("");
																					int n=sc.nextInt();
																					if (n==1)
																					{
																						System.out.println("_ - - _ Thank You_ - - _");
																					}
																					else if (n==2)
																					{
																						System.out.println("**************************");
																						System.out.println(" CANCELLATION TICKET");
																						System.out.println("");
																						System.out.println("Enter 1 for to cancel th ticket");
																						System.out.println("Enter 2 for to exit");
																						System.out.println("");
																						int o=sc.nextInt();
																						if (o==1)
																						{
																							System.out.println("");
																							System.out.println("Dear "+temp10+", we are regreting");
																					        System.out.println("to inform your upcoming trip from");
																					        System.out.println(temp6+" to "+temp7+" is CANCELLED");
																					        System.out.println("");
																					        System.out.println("               -Team BOOKurbuS");
																						}
																						else if (o==2)
																						{
																							System.out.println("Values are cancelled...Visit again");
																						}
																						else
																						{
																							System.out.println("Sorry...Invalid input(o)");
																						}
																					}
																					else
																					{
																						System.out.println("Sorry...invalid input(n)");
																					}
																				}
																				else if (m==2)
																				{
																					System.out.println("Mail message:");
																					System.out.println("Passenger name: "+temp10);
																					System.out.println("Gender        : "+temp11);
																					System.out.println("Passenger Age : "+temp12);
																					System.out.println("Bus number    :IND22IN1999");
																					System.out.println("From place    : "+temp6);
																					System.out.println("To place      : "+temp7);
																					System.out.println("Boarding point: "+temp8);
																					System.out.println("Boarding time : "+temp9);
																					System.out.println("Dear "+temp10+", please see above");
																					System.out.println("details for your upcoming trip");
																					System.out.println("from "+temp6+" to "+temp7+"......");
																					System.out.println("");
																					System.out.println("               -Team BOOKurbuS");
																					System.out.println("");
																					System.out.println("*******************************");
																					System.out.println("Enter 1 for exit");
																					System.out.println("Enter 2 for to CANCEL the TICKET");
																					System.out.println("*******************************");
																					System.out.println("");
																					int n=sc.nextInt();
																					if (n==1)
																					{
																						System.out.println("_ - - _ Thank You_ - - _");
																					}
																					else if (n==2)
																					{
																						System.out.println("**************************");
																						System.out.println(" CANCELLATION TICKET");
																						System.out.println("");
																						System.out.println("Enter 1 for to cancel th ticket");
																						System.out.println("Enter 2 for to exit");
																						System.out.println("");
																						int o=sc.nextInt();
																						if (o==1)
																						{
																							System.out.println("");
																							System.out.println("Dear "+temp10+", we are regreting");
																					        System.out.println("to inform your upcoming trip from");
																					        System.out.println(temp6+" to "+temp7+" is CANCELLED");
																					        System.out.println("");
																					        System.out.println("               -Team BOOKurbuS");
																						}
																						else if (o==2)
																						{
																							System.out.println("Values are cancelled...Visit again");
																						}
																						else
																						{
																							System.out.println("Sorry...Invalid input(o)");
																						}
																					}
																					else
																					{
																						System.out.println("Sorry...invalid input(n)");
																					}
																				}
																				else if (m==3)
																				{
																					System.out.println("");
																				}
																				else
																				{
																					System.out.println("Sorry...Invalid input(m)");
																				}
																			}
																			else
																			{
																				System.out.println("Sorry...OTP is invalid");
																			}
																		}
																	}break;
																case 3:
																	{
																		System.out.println("");
																		System.out.println("PayTm:");
																		System.out.println("");
																		System.out.println(temp6+"    -->   "+temp7);
																		System.out.println(temp9+"   ----   "+temp5);
																		System.out.println("");
																		System.out.println("Enter OTP to complete the payment");
																		int otp=sc.nextInt();
																		int temp14=otp;
																		int count3=0;
																		{
																			while (otp!=0)
																			{
																				count3++;
																				otp=otp/10;
																			}
																			if (count3==4||count3==6)
																			{
																				System.out.println(temp14+" OTP is valid");
																				System.out.println("");
																				System.out.println("*******************************************");
																				System.out.println("         Payment successfully completed");
																				System.out.println("");
																				System.out.println("         You received 'BOOKurbuS' ticket ");
																				System.out.println("*******************************************");
																				System.out.println("");
																				System.out.println("Enter 1 for to view Mobile message");
																				System.out.println("Enter 2 for to view Mail message");
																				System.out.println("Enter 3 for Neglect (or) Exit");
																				System.out.println("");
																				int m=sc.nextInt();
																				if (m==1)
																				{
																					System.out.println("Mobile message");
																					System.out.println("Passenger name: "+temp10);
																					System.out.println("Gender        : "+temp11);
																					System.out.println("Passenger Age : "+temp12);
																					System.out.println("Bus number    :IND22IN1999");
																					System.out.println("From place    : "+temp6);
																					System.out.println("To place      : "+temp7);
																					System.out.println("Boarding point: "+temp8);
																					System.out.println("Boarding time : "+temp9);
																					System.out.println("Dear "+temp10+", please see above");
																					System.out.println("details for your upcoming trip");
																					System.out.println("from "+temp6+" to "+temp7+"......");
																					System.out.println("");
																					System.out.println("               -Team BOOKurbuS");
																					System.out.println("");
																					System.out.println("*******************************");
																					System.out.println("Enter 1 for exit");
																					System.out.println("Enter 2 for to CANCEL the TICKET");
																					System.out.println("*******************************");
																					System.out.println("");
																					int n=sc.nextInt();
																					if (n==1)
																					{
																						System.out.println("_ - - _ Thank You_ - - _");
																					}
																					else if (n==2)
																					{
																						System.out.println("**************************");
																						System.out.println(" CANCELLATION TICKET");
																						System.out.println("");
																						System.out.println("Enter 1 for to cancel th ticket");
																						System.out.println("Enter 2 for to exit");
																						System.out.println("");
																						int o=sc.nextInt();
																						if (o==1)
																						{
																							System.out.println("");
																							System.out.println("Dear "+temp10+", we are regreting");
																					        System.out.println("to inform your upcoming trip from");
																					        System.out.println(temp6+" to "+temp7+" is CANCELLED");
																					        System.out.println("");
																					        System.out.println("               -Team BOOKurbuS");
																						}
																						else if (o==2)
																						{
																							System.out.println("Values are cancelled...Visit again");
																						}
																						else
																						{
																							System.out.println("Sorry...Invalid input(o)");
																						}
																					}
																					else
																					{
																						System.out.println("Sorry...invalid input(n)");
																					}
																				}
																				else if (m==2)
																				{
																					System.out.println("Mail message");
																					System.out.println("Passenger name: "+temp10);
																					System.out.println("Gender        : "+temp11);
																					System.out.println("Passenger Age : "+temp12);
																					System.out.println("Bus number    :IND22IN1999");
																					System.out.println("From place    : "+temp6);
																					System.out.println("To place      : "+temp7);
																					System.out.println("Boarding point: "+temp8);
																					System.out.println("Boarding time : "+temp9);
																					System.out.println("Dear "+temp10+", please see above");
																					System.out.println("details for your upcoming trip");
																					System.out.println("from "+temp6+" to "+temp7+"......");
																					System.out.println("");
																					System.out.println("               -Team BOOKurbuS");
																					System.out.println("");
																					System.out.println("*******************************");
																					System.out.println("Enter 1 for exit");
																					System.out.println("Enter 2 for to CANCEL the TICKET");
																					System.out.println("*******************************");
																					System.out.println("");
																					int n=sc.nextInt();
																					if (n==1)
																					{
																						System.out.println("_ - - _ Thank You_ - - _");
																					}
																					else if (n==2)
																					{
																						System.out.println("**************************");
																						System.out.println(" CANCELLATION TICKET");
																						System.out.println("");
																						System.out.println("Enter 1 for to cancel th ticket");
																						System.out.println("Enter 2 for to exit");
																						System.out.println("");
																						int o=sc.nextInt();
																						if (o==1)
																						{
																							System.out.println("");
																							System.out.println("Dear "+temp10+", we are regreting");
																					        System.out.println("to inform your upcoming trip from");
																					        System.out.println(temp6+" to "+temp7+" is CANCELLED");
																					        System.out.println("");
																					        System.out.println("               -Team BOOKurbuS");
																						}
																						else if (o==2)
																						{
																							System.out.println("Values are cancelled...Visit again");
																						}
																						else
																						{
																							System.out.println("Sorry...Invalid input(o)");
																						}
																					}
																					else
																					{
																						System.out.println("Sorry...invalid input(n)");
																					}
																				}
																				else if (m==3)
																				{
																					System.out.println("");
																				}
																				else
																				{
																					System.out.println("Sorry...Invalid input(m)");
																				}
																			}
																			else
																			{
																				System.out.println("Sorry...OTP is invalid");
																			}
																		}
																	}break;
																case 4:
																	{
																		System.out.println("Cash");
																		System.out.println("");
																		System.out.println("We are curently not accepting cash (or) offline 'money'");
																	}break;
																default:
																	{
																		System.out.println("Sorry...Invalid input");
																	}
																
																}
															}
															else if (k==2)
															{
																System.out.println("Values are cancelled...Visit again(k)");
															}
															else
															{
																System.out.println("Sorry...Invalid input(k)");
															}
														}break;
													case 2:
														{
															System.out.println("*************************");
															System.out.println("************************");
															System.out.println("  We protected you...Your protection is our Safety:");
															System.out.println("************************");
															System.out.println("Enter 1 for continue booking");
															System.out.println("Enter 2 for exit");
															System.out.println("");
															int k=sc.nextInt();
															if (k==1)
															{
																System.out.println("    Continue Booking");
																System.out.println("");
																System.out.println("Charges in Rupees/- :");
																int charge=sc.nextInt();
																int temp15=charge;
																System.out.println("Select a Payment option:");
																System.out.println("");
																System.out.println("Enter 1 for Gpay");
																System.out.println("Enter 2 for PhonePay");
																System.out.println("Enter 3 for PayTm");
																System.out.println("Enter 4 for cash");
																System.out.println("");
																int l=sc.nextInt();
																switch (l)
																{
																case 1:
																	{
																	    System.out.println("");
																		System.out.println("Gpay:");
																		System.out.println("");
																		System.out.println(temp6+"    -->   "+temp7);
																		System.out.println(temp9+"   ----   "+temp5);
																		System.out.println("");
																		System.out.println("Enter OTP to complete the payment");
																		int otp=sc.nextInt();
																		int temp14=otp;
																		int count3=0;
																		{
																			while (otp!=0)
																			{
																				count3++;
																				otp=otp/10;
																			}
																			if (count3==4||count3==6)
																			{
																				System.out.println(temp14+" OTP is valid");
																				System.out.println("");
																				System.out.println("*******************************************");
																				System.out.println("         Payment successfully completed");
																				System.out.println("");
																				System.out.println("         You received 'BOOKurbuS' ticket ");
																				System.out.println("*******************************************");
																				System.out.println("");
																				System.out.println("Enter 1 for to view Mobile message");
																				System.out.println("Enter 2 for to view Mail message");
																				System.out.println("Enter 3 for Neglect (or) Exit");
																				System.out.println("");
																				int m=sc.nextInt();
																				if (m==1)
																				{
																					System.out.println("Mobile message:");
																					System.out.println("Passenger name: "+temp10);
																					System.out.println("Gender        : "+temp11);
																					System.out.println("Passenger Age : "+temp12);
																					System.out.println("Bus number    :IND22IN1999");
																					System.out.println("From place    : "+temp6);
																					System.out.println("To place      : "+temp7);
																					System.out.println("Boarding point: "+temp8);
																					System.out.println("Boarding time : "+temp9);
																					System.out.println("Dear "+temp10+", please see above");
																					System.out.println("details for your upcoming trip");
																					System.out.println("from "+temp6+" to "+temp7+"......");
																					System.out.println("");
																					System.out.println("               -Team BOOKurbuS");
																					System.out.println("");
																					System.out.println("*******************************");
																					System.out.println("Enter 1 for exit");
																					System.out.println("Enter 2 for to CANCEL the TICKET");
																					System.out.println("*******************************");
																					System.out.println("");
																					int n=sc.nextInt();
																					if (n==1)
																					{
																						System.out.println("_ - - _ Thank You_ - - _");
																					}
																					else if (n==2)
																					{
																						System.out.println("**************************");
																						System.out.println(" CANCELLATION TICKET");
																						System.out.println("");
																						System.out.println("Enter 1 for to cancel th ticket");
																						System.out.println("Enter 2 for to exit");
																						System.out.println("");
																						int o=sc.nextInt();
																						if (o==1)
																						{
																							System.out.println("");
																							System.out.println("Dear "+temp10+", we are regreting");
																					        System.out.println("to inform your upcoming trip from");
																					        System.out.println(temp6+" to "+temp7+" is CANCELLED");
																					        System.out.println("");
																					        System.out.println("               -Team BOOKurbuS");
																						}
																						else if (o==2)
																						{
																							System.out.println("Values are cancelled...Visit again");
																						}
																						else
																						{
																							System.out.println("Sorry...Invalid input(o)");
																						}
																					}
																					else
																					{
																						System.out.println("Sorry...invalid input(n)");
																					}
																				}
																				else if (m==2)
																				{
																					System.out.println("Mail message:");
																					System.out.println("Passenger name: "+temp10);
																					System.out.println("Gender        : "+temp11);
																					System.out.println("Passenger Age : "+temp12);
																					System.out.println("Bus number    :IND22IN1999");
																					System.out.println("From place    : "+temp6);
																					System.out.println("To place      : "+temp7);
																					System.out.println("Boarding point: "+temp8);
																					System.out.println("Boarding time : "+temp9);
																					System.out.println("Dear "+temp10+", please see above");
																					System.out.println("details for your upcoming trip");
																					System.out.println("from "+temp6+" to "+temp7+"......");
																					System.out.println("");
																					System.out.println("               -Team BOOKurbuS");
																					System.out.println("");
																					System.out.println("*******************************");
																					System.out.println("Enter 1 for exit");
																					System.out.println("Enter 2 for to CANCEL the TICKET");
																					System.out.println("*******************************");
																					System.out.println("");
																					int n=sc.nextInt();
																					if (n==1)
																					{
																						System.out.println("_ - - _ Thank You_ - - _");
																					}
																					else if (n==2)
																					{
																						System.out.println("**************************");
																						System.out.println(" CANCELLATION TICKET");
																						System.out.println("");
																						System.out.println("Enter 1 for to cancel th ticket");
																						System.out.println("Enter 2 for to exit");
																						System.out.println("");
																						int o=sc.nextInt();
																						if (o==1)
																						{
																							System.out.println("");
																							System.out.println("Dear "+temp10+", we are regreting");
																					        System.out.println("to inform your upcoming trip from");
																					        System.out.println(temp6+" to "+temp7+" is CANCELLED");
																					        System.out.println("");
																					        System.out.println("               -Team BOOKurbuS");
																						}
																						else if (o==2)
																						{
																							System.out.println("Values are cancelled...Visit again");
																						}
																						else
																						{
																							System.out.println("Sorry...Invalid input(o)");
																						}
																					}
																					else
																					{
																						System.out.println("Sorry...invalid input(n)");
																					}
																				}
																				else if (m==3)
																				{
																					System.out.println("");
																				}
																				else
																				{
																					System.out.println("Sorry...Invalid input(m)");
																				}
																			}
																			else
																			{
																				System.out.println("Sorry...OTP is invalid");
																			}
																		}
																	}break;
																case 2:
																	{
																		System.out.println("");
																		System.out.println("PhonePay:");
																		System.out.println("");
																		System.out.println(temp6+"    -->   "+temp7);
																		System.out.println(temp9+"   ----   "+temp5);
																		System.out.println("");
																		System.out.println("Enter OTP to complete the payment");
																		int otp=sc.nextInt();
																		int temp14=otp;
																		int count3=0;
																		{
																			while (otp!=0)
																			{
																				count3++;
																				otp=otp/10;
																			}
																			if (count3==4||count3==6)
																			{
																				System.out.println(temp14+" OTP is valid");
																				System.out.println("");
																				System.out.println("*******************************************");
																				System.out.println("         Payment successfully completed");
																				System.out.println("");
																				System.out.println("         You received 'BOOKurbuS' ticket ");
																				System.out.println("*******************************************");
																				System.out.println("");
																				System.out.println("Enter 1 for to view Mobile message");
																				System.out.println("Enter 2 for to view Mail message");
																				System.out.println("Enter 3 for Neglect (or) Exit");
																				System.out.println("");
																				int m=sc.nextInt();
																				if (m==1)
																				{
																					System.out.println("Mobile message:");
																					System.out.println("Passenger name: "+temp10);
																					System.out.println("Gender        : "+temp11);
																					System.out.println("Passenger Age : "+temp12);
																					System.out.println("Bus number    :IND22IN1999");
																					System.out.println("From place    : "+temp6);
																					System.out.println("To place      : "+temp7);
																					System.out.println("Boarding point: "+temp8);
																					System.out.println("Boarding time : "+temp9);
																					System.out.println("Dear "+temp10+", please see above");
																					System.out.println("details for your upcoming trip");
																					System.out.println("from "+temp6+" to "+temp7+"......");
																					System.out.println("");
																					System.out.println("               -Team BOOKurbuS");
																					System.out.println("");
																					System.out.println("*******************************");
																					System.out.println("Enter 1 for exit");
																					System.out.println("Enter 2 for to CANCEL the TICKET");
																					System.out.println("*******************************");
																					System.out.println("");
																					int n=sc.nextInt();
																					if (n==1)
																					{
																						System.out.println("_ - - _ Thank You_ - - _");
																					}
																					else if (n==2)
																					{
																						System.out.println("**************************");
																						System.out.println(" CANCELLATION TICKET");
																						System.out.println("");
																						System.out.println("Enter 1 for to cancel th ticket");
																						System.out.println("Enter 2 for to exit");
																						System.out.println("");
																						int o=sc.nextInt();
																						if (o==1)
																						{
																							System.out.println("");
																							System.out.println("Dear "+temp10+", we are regreting");
																					        System.out.println("to inform your upcoming trip from");
																					        System.out.println(temp6+" to "+temp7+" is CANCELLED");
																					        System.out.println("");
																					        System.out.println("               -Team BOOKurbuS");
																						}
																						else if (o==2)
																						{
																							System.out.println("Values are cancelled...Visit again");
																						}
																						else
																						{
																							System.out.println("Sorry...Invalid input(o)");
																						}
																					}
																					else
																					{
																						System.out.println("Sorry...invalid input(n)");
																					}
																				}
																				else if (m==2)
																				{
																					System.out.println("Mail message:");
																					System.out.println("Passenger name: "+temp10);
																					System.out.println("Gender        : "+temp11);
																					System.out.println("Passenger Age : "+temp12);
																					System.out.println("Bus number    :IND22IN1999");
																					System.out.println("From place    : "+temp6);
																					System.out.println("To place      : "+temp7);
																					System.out.println("Boarding point: "+temp8);
																					System.out.println("Boarding time : "+temp9);
																					System.out.println("Dear "+temp10+", please see above");
																					System.out.println("details for your upcoming trip");
																					System.out.println("from "+temp6+" to "+temp7+"......");
																					System.out.println("");
																					System.out.println("               -Team BOOKurbuS");
																					System.out.println("");
																					System.out.println("*******************************");
																					System.out.println("Enter 1 for exit");
																					System.out.println("Enter 2 for to CANCEL the TICKET");
																					System.out.println("*******************************");
																					System.out.println("");
																					int n=sc.nextInt();
																					if (n==1)
																					{
																						System.out.println("_ - - _ Thank You_ - - _");
																					}
																					else if (n==2)
																					{
																						System.out.println("**************************");
																						System.out.println(" CANCELLATION TICKET");
																						System.out.println("");
																						System.out.println("Enter 1 for to cancel th ticket");
																						System.out.println("Enter 2 for to exit");
																						System.out.println("");
																						int o=sc.nextInt();
																						if (o==1)
																						{
																							System.out.println("");
																							System.out.println("Dear "+temp10+", we are regreting");
																					        System.out.println("to inform your upcoming trip from");
																					        System.out.println(temp6+" to "+temp7+" is CANCELLED");
																					        System.out.println("");
																					        System.out.println("               -Team BOOKurbuS");
																						}
																						else if (o==2)
																						{
																							System.out.println("Values are cancelled...Visit again");
																						}
																						else
																						{
																							System.out.println("Sorry...Invalid input(o)");
																						}
																					}
																					else
																					{
																						System.out.println("Sorry...invalid input(n)");
																					}
																				}
																				else if (m==3)
																				{
																					System.out.println("");
																				}
																				else
																				{
																					System.out.println("Sorry...Invalid input(m)");
																				}
																			}
																			else
																			{
																				System.out.println("Sorry...OTP is invalid");
																			}
																		}
																	}break;
																case 3:
																	{
																		System.out.println("");
																		System.out.println("PayTm:");
																		System.out.println("");
																		System.out.println(temp6+"    -->   "+temp7);
																		System.out.println(temp9+"   ----   "+temp5);
																		System.out.println("");
																		System.out.println("Enter OTP to complete the payment");
																		int otp=sc.nextInt();
																		int temp14=otp;
																		int count3=0;
																		{
																			while (otp!=0)
																			{
																				count3++;
																				otp=otp/10;
																			}
																			if (count3==4||count3==6)
																			{
																				System.out.println(temp14+" OTP is valid");
																				System.out.println("");
																				System.out.println("*******************************************");
																				System.out.println("         Payment successfully completed");
																				System.out.println("");
																				System.out.println("         You received 'BOOKurbuS' ticket ");
																				System.out.println("*******************************************");
																				System.out.println("");
																				System.out.println("Enter 1 for to view Mobile message");
																				System.out.println("Enter 2 for to view Mail message");
																				System.out.println("Enter 3 for Neglect (or) Exit");
																				System.out.println("");
																				int m=sc.nextInt();
																				if (m==1)
																				{
																					System.out.println("Mobile message");
																					System.out.println("Passenger name: "+temp10);
																					System.out.println("Gender        : "+temp11);
																					System.out.println("Passenger Age : "+temp12);
																					System.out.println("Bus number    :IND22IN1999");
																					System.out.println("From place    : "+temp6);
																					System.out.println("To place      : "+temp7);
																					System.out.println("Boarding point: "+temp8);
																					System.out.println("Boarding time : "+temp9);
																					System.out.println("Dear "+temp10+", please see above");
																					System.out.println("details for your upcoming trip");
																					System.out.println("from "+temp6+" to "+temp7+"......");
																					System.out.println("");
																					System.out.println("               -Team BOOKurbuS");
																					System.out.println("");
																					System.out.println("*******************************");
																					System.out.println("Enter 1 for exit");
																					System.out.println("Enter 2 for to CANCEL the TICKET");
																					System.out.println("*******************************");
																					System.out.println("");
																					int n=sc.nextInt();
																					if (n==1)
																					{
																						System.out.println("_ - - _ Thank You_ - - _");
																					}
																					else if (n==2)
																					{
																						System.out.println("**************************");
																						System.out.println(" CANCELLATION TICKET");
																						System.out.println("");
																						System.out.println("Enter 1 for to cancel th ticket");
																						System.out.println("Enter 2 for to exit");
																						System.out.println("");
																						int o=sc.nextInt();
																						if (o==1)
																						{
																							System.out.println("");
																							System.out.println("Dear "+temp10+", we are regreting");
																					        System.out.println("to inform your upcoming trip from");
																					        System.out.println(temp6+" to "+temp7+" is CANCELLED");
																					        System.out.println("");
																					        System.out.println("               -Team BOOKurbuS");
																						}
																						else if (o==2)
																						{
																							System.out.println("Values are cancelled...Visit again");
																						}
																						else
																						{
																							System.out.println("Sorry...Invalid input(o)");
																						}
																					}
																					else
																					{
																						System.out.println("Sorry...invalid input(n)");
																					}
																				}
																				else if (m==2)
																				{
																					System.out.println("Mail message");
																					System.out.println("Passenger name: "+temp10);
																					System.out.println("Gender        : "+temp11);
																					System.out.println("Passenger Age : "+temp12);
																					System.out.println("Bus number    :IND22IN1999");
																					System.out.println("From place    : "+temp6);
																					System.out.println("To place      : "+temp7);
																					System.out.println("Boarding point: "+temp8);
																					System.out.println("Boarding time : "+temp9);
																					System.out.println("Dear "+temp10+", please see above");
																					System.out.println("details for your upcoming trip");
																					System.out.println("from "+temp6+" to "+temp7+"......");
																					System.out.println("");
																					System.out.println("               -Team BOOKurbuS");
																					System.out.println("");
																					System.out.println("*******************************");
																					System.out.println("Enter 1 for exit");
																					System.out.println("Enter 2 for to CANCEL the TICKET");
																					System.out.println("*******************************");
																					System.out.println("");
																					int n=sc.nextInt();
																					if (n==1)
																					{
																						System.out.println("_ - - _ Thank You_ - - _");
																					}
																					else if (n==2)
																					{
																						System.out.println("**************************");
																						System.out.println(" CANCELLATION TICKET");
																						System.out.println("");
																						System.out.println("Enter 1 for to cancel th ticket");
																						System.out.println("Enter 2 for to exit");
																						System.out.println("");
																						int o=sc.nextInt();
																						if (o==1)
																						{
																							System.out.println("");
																							System.out.println("Dear "+temp10+", we are regreting");
																					        System.out.println("to inform your upcoming trip from");
																					        System.out.println(temp6+" to "+temp7+" is CANCELLED");
																					        System.out.println("");
																					        System.out.println("               -Team BOOKurbuS");
																						}
																						else if (o==2)
																						{
																							System.out.println("Values are cancelled...Visit again");
																						}
																						else
																						{
																							System.out.println("Sorry...Invalid input(o)");
																						}
																					}
																					else
																					{
																						System.out.println("Sorry...invalid input(n)");
																					}
																				}
																				else if (m==3)
																				{
																					System.out.println("");
																				}
																				else
																				{
																					System.out.println("Sorry...Invalid input(m)");
																				}
																			}
																			else
																			{
																				System.out.println("Sorry...OTP is invalid");
																			}
																		}
																	}break;
																case 4:
																	{
																		System.out.println("Cash");
																		System.out.println("");
																		System.out.println("We are curently not accepting cash (or) offline 'money'");
																	}break;
																default:
																	{
																		System.out.println("Sorry...Invalid input");
																	}
																
																}
															}
															else if (k==2)
															{
																System.out.println("Values are cancelled...Visit again(k)");
															}
															else
															{
																System.out.println("Sorry...Invalid input(k)");
															}
														}break;
													default:
														{
														   System.out.println("Sorry...Invalid input(j)");
														}
													}
												}
												else
												{
													System.out.println("Age is not valid");
												}
											}
										}
										else if (i==2)
										{
											System.out.println("Values are cancelled...Visit again(i)");
										}
										else
										{
											System.out.println("Sorry...Invalid input(i)");
										}
									}
									else if (h==2)
									{
										System.out.println("Values are cancelled...Visit again(h)");
									}
									else
									{
										System.out.println("Sorry...Invalid input(h)");
									}
								}
								else if (g==2)
								{
									System.out.println("Values are cancelled...Visit again(g)");
								}
								else
								{
									System.out.println("Sorry...Invalid inpput(g)");
								}
							}break;
							case 2:
							{
								System.out.println("Values are cancelled...Visit again(d)");
							}break;
							default:
							{
								System.out.println("Sorry...Invalid input(d)");
							}
						}
					}
					else
					{
						System.out.println("Invalid User name OR Password");
					}
				}
				else if (c==2)
				{
					System.out.println("Values are cancelled...Visit again(c)");
				}
				else
				{
					System.out.println("Sorry...Invalid input(c)");
				}
			}
			else if (b==2)
			{
				System.out.println("Values are cancelled...Visit again(b)");
			}
			else
			{
				System.out.println("Sorry...Invalid input(b)");
			}
				}
				else
				{
					System.out.println("Mobile number is not valid");
				}
			}
		}
		else if (a==2)
		{
			System.out.println("Values are cancelled...Visit again(a)");
		}
		else
		{
			System.out.println("Sorry...Invalid input(a)");
		}
		sc.close();
	}
}
