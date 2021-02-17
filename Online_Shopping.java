import java.io.*;
class Online_Shopping 
{
public static void main(String args[])throws IOException 
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int yn , i , c , mb , samb , appb , opb , lenb , honb , mib , motb , oppb , vivb , nokb  , delb , hpb , micb , aceb , asub , eb , tvb , refb , wasb , airb , hcb , musb , camb , coob , hb , crob , gasb , homb , litb , gb , fvb , ffb , daib , ceb , bevb , insb , saub , perb , houb , sb , crib , badb , cycb , fotb , cb , diab , toyb , fodb , skib , feeb , csam , capp , cop , clen , chon , cmi , cmot , copp , cviv , cnok , cdel , chp , cmic , cace , casu , ctv , cref , cwas , cair , chc , cmus , ccam , ccoo , ccro , cgas , chom , clit , cfv , cff , cdai , cce , cbev , cins , csau , cper , chou , ccri , cbad , ccyc , cfot , cdia , ctoy , cfod , cski , cfee ;
System.out.println( " Welcome to Amazon India " );
System.out.println( " Aapki Apni Dukan " );
System.out.println( " We have the largest variety of products in the country at your fingertips delivered to your doors " );
System.out.println( " Have a merry shopping experience :-) " ); 
System.out.println( " Enter 0 to exit " );
System.out.println( " To continue enter any other number " );
yn=Integer.parseInt(br.readLine());
while(yn!=0)
{
String C[]={ " Mobiles and Computers " , " TV , Appliances and Electronics " , " Home and Kitchen " , " Grocery " , " Sports and Fitness " , " Baby Products " , " Vehicle Accessories " , " Pets " , " Travel " , " Premium Products " , " Season Discount Products " , " Global Store " };
System.out.println( " The categories are : " );
for(i=0;i<6;i++)
System.out.println( (i+1) + "." + C[i] );
System.out.println( " Please enter the category you want to shop for using their respective numbers " );  
c=Integer.parseInt(br.readLine());
switch(c)
{
case 1:
System.out.println( " Welcome to Mobiles and Computers " );
System.out.println( " In this category you can shop for top brands and numerous variety " );
String MB[]={ " Samsung " , " Apple " , " One Plus " , " Lenovo " , " Honour " , " Xiaomi " , " Motorola " , " Oppo " , " Vivo " , " Nokia " , " Dell " , " HP " , " Microsoft " , " Acer " , " Asus " };
System.out.println( " The availabe brands are : " );
for(i=0;i<15;i++)
System.out.println( (i+1) + "." + MB[i] );
System.out.println( " Please enter the brand you want to shop for using their respective numbers " );
mb=Integer.parseInt(br.readLine());
if(mb==1)
{
System.out.println( " This is the World Famous brand SAMSUNG " );
System.out.println( " Imagine the amazing things we can build " );
System.out.println( " The products are displayed in the format - Product:Price/Discount% " );
String SAM[]={ " Galaxy Note 8 : 67,900 " , " Galaxy S8 : 53,900 " , " Galaxy S8 Plus : 64,999 " , " Galaxy S7 : 36,5999/20% " , " Galaxy S7 Edge : 50,500/6% " , " Galaxy J7 Max : 16,875/11% " , " Galaxy J7 Prime : 15,990/5% " , " Galaxy J7 Pro : 19,900/10% " , " Galaxy J5 : 10,090/8% " , " Galaxy On 8 : 12,090/10% " };
System.out.println( " The products are : " );
for(i=0;i<10;i++)
System.out.println( (i+1) + "." + SAM[i] );
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
samb=Integer.parseInt(br.readLine());
if(samb!=0)
{
System.out.println( " Enter 1 to continue or enter 0 " );
csam=Integer.parseInt(br.readLine());
if(csam!=0);
{
if(csam==1) 
{   
System.out.println( SAM[samb-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you in 7-10 business days " );
System.out.println( " Thank you for shopping :-) " );
}
if((csam!=0)&&(csam!=1))
System.out.println( " Wrongly Entered ! " );
}
}
if(samb==0)
System.out.println( " Thank you for visiting " );
if(samb>10)
System.out.println( " Wrong Choice ! " );
}
if(mb==2)
{
System.out.println( " This is the brand of the premiums , APPLE " );
System.out.println( "            Think Different                " );
System.out.println( " The Mobiles are displayed in the format - Product:Price/Discount% " );
System.out.println( " The laptops are displayed in the format - Product Size Core/RAM/ROM:Price/Discount% " );
String APP[]={ " IPhone X 256GB : 102,000 " , " IPhone X 64GB : 89,000 " , " IPhone 8 : 61,191/4% " , " IPhone 8 Plus : 69,999/4% " , " IPhone 7 : 44,999/8% " , " IPhone 7 Plus : 67,900 " , " IPhone 6 : 25,000/10% " , " IPhone 6s : 36,988/7% " , " IPhone 6s Plus : 43,900/10% " , " IPhone SE : 21,898/15% " , " IPhone 5s :19,989/20% " , " MacBook Air 13.3-inch i5/8GB/128GB : 56,690/26% " , " MacBook Pro 15-inch i7/16GB/256GB : 139,797/10% " , " MacBook Air 13-inch i5/8GB/256GB : 73,400/24% " , " MacBook Pro 15-inch i7/16GB/512GB : 249,330 " };    
System.out.println( " The products are : " );
for(i=0;i<15;i++)    
System.out.println( (i+1) + "." + APP[i] );
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
appb=Integer.parseInt(br.readLine());
if(appb!=0)
{
System.out.println( " Enter 1 to continue or enter 0 " );
capp=Integer.parseInt(br.readLine());
if(capp!=0);
{
if(capp==1);
{    
System.out.println( APP[appb-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you in 7-10 business days " );
System.out.println( " Thank you for shopping :-) " );
}
if((capp!=0)&&(capp!=1))
System.out.println( " Wrongly Entered ! " );
}
}
if(appb==0)
System.out.println( " Thank you for visiting " );
if(appb>15)
System.out.println( " Wrong Choice ! " );
}
if(mb==3)
{
System.out.println( " This is the brand of class , ONE PLUS " );
System.out.println( "             Never Settle              " );
System.out.println( " The products are displayed in the format - Product:Price/Discount% " );
String OP[]={ " One Plus 5T 64GB : 32,999 " , " One Plus 5T 128GB : 37,999 " , " One Plus 5 : 37,999 " , " One Plus 3T : 27,000/10% " , " One Plus 3 : 21,499 " , " One Plus 2 : 14,999 " }; 
System.out.println( " The products are : " );
for(i=0;i<6;i++)   
System.out.println( (i+1) + "." + OP[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
opb=Integer.parseInt(br.readLine());
if(opb!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
cop=Integer.parseInt(br.readLine());
if(cop!=0);
{
if(cop==1);
{    
System.out.println( OP[opb-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you in 7-10 business days " );
System.out.println( " Thank you for shopping :-) " );
}
if((cop!=0)&&(cop!=1))
System.out.println( " Wrongly Entered ! " );
}
}
if(opb==0)
System.out.println( " Thank you for visiting " );
if(opb>6)
System.out.println( " Wrong Choice ! " );
}
if(mb==4)
{
System.out.println( " This is the BrAnD , LENOVO " );
System.out.println( " Innovation Never Stands Still " );
System.out.println( " The Mobiles are displayed in the format - Product:Price/Discount% " );
System.out.println( " The Laptops are displayed in the format - Product Size Core/RAM/ROM:Price/Discount% " );
String LEN[]={ " Lenovo K8 Note : 12,999/7% " , " Lenovo K6 Power : 8,199 " , " Lenovo Vibe K5 : 8,399 " , " Lenovo K5 Note : 8,498 " , " Lenovo Z2 Plus : 10,000/50% " , " Lenovo K4 Note : 6,500/35% " , " Lenovo A6600 Plus : 6,143/27% " , " Lenovo IdeaPad 15.6-inch i3/4GB/1TB : 31,990/6% " , " Lenovo ThinkPad X1 Carbon 14-inch i7/8GB/256GB : 180,000 " , " Lenovo ThinkPad E470 14-inch i3/4GB/1TB " , " Lenovo Yoga 500 14-inch i5/4GB/500GB : 61,490 " };
System.out.println( " The products are : " );
for(i=0;i<11;i++)   
System.out.println( (i+1) + "." + LEN[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
lenb=Integer.parseInt(br.readLine());
if(lenb!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
clen=Integer.parseInt(br.readLine());
if(clen!=0);
{
if(clen==1);
{    
System.out.println( LEN[lenb-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you in 7-10 business days " );
System.out.println( " Thank you for shopping :-) " ); 
}
if((clen!=0)&&(clen!=1))
System.out.println( " Wrongly Entered ! " );
}
}
if(lenb==0)
System.out.println( " Thank you for visiting " );
if(lenb>11)
System.out.println( " Wrong Choice ! " );
}
if(mb==5)
{
System.out.println( " This the sub-brand of Huawei , HONOR " );
System.out.println( "            For The Brave             " );
System.out.println( " The products are displayed in the format - Product:Price/Discount% " );
String HON[]={ " Honor 8 Pro : 29,950 " , " Honor 8 : 15,000/50% " , " Honor 6X : 13,999 " , " Honor Holly 4 : 11,090 " , " Honor 5C : 8,999 " , " Honor 4X : 7,339 " };
System.out.println( " The products are : " );
for(i=0;i<6;i++)   
System.out.println( (i+1) + "." + HON[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
honb=Integer.parseInt(br.readLine());
if(honb!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
chon=Integer.parseInt(br.readLine());
if(chon!=0);
{
if(chon==1);
{    
System.out.println( HON[honb-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you in 7-10 business days " );
System.out.println( " Thank you for shopping :-) " );
}
if((chon!=0)&&(chon!=1))
System.out.println( " Wrongly Entered ! " );
}
}
if(honb==0)
System.out.println( " Thank you for visiting " );
if(honb>6)
System.out.println( " Wrong Choice ! " );
}
if(mb==6)
{
System.out.println( "  This is the no. 1 selling smartphone in India , XIAOMI  " );
System.out.println( " Always Believe That something Wonderful is About to Happen " );
System.out.println( " The products are displayed in the format - Product:Price/Discount% " );    
String MI[]={ " Mi MIX 2 : 35,999 " , " Mi A1 : 14,999 " , " Redmi Note 4 : 9,999 " , " Redmi Y1 Lite : 6,999 " , " Redmi 4A : 5,999 " , " Redmi Y1 : 8,999 " , " Redmi 4 : 6,999 " , " Mi Max 2 : 13,999 " };
System.out.println( " The products are : " );
for(i=0;i<8;i++)   
System.out.println( (i+1) + "." + MI[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
mib=Integer.parseInt(br.readLine());
if(mib!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
cmi=Integer.parseInt(br.readLine());
if(cmi!=0);
{
if(cmi==1);
{    
System.out.println( MI[mib-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you in 7-10 business days " );
System.out.println( " Thank you for shopping :-) " );
}
if((cmi!=0)&&(cmi!=1))
System.out.println( " Wrongly Entered ! " );
}
}
if(mib==0)
System.out.println( " Thank you for visiting " );
if(mib>8)
System.out.println( " Wrong Choice ! " );
}
if(mb==7)
{
System.out.println( " This the King of brands , MOTOROLA " );
System.out.println( "           Hello Moto !             " );
System.out.println( " The products are displayed in the format - Product:Price/Discount% " );
String MOT[]={ " Moto G5s Plus : 15,999/5% " , " Moto G5 : 9,999/16% " , " Moto G5s : 13,919 " , " Moto M : 15,888 " , " Moto G4 Plus : 9,490 " , " Moto Z Play with Style Mod : 24,990 " , " Moto E4 : 8,228 " , " Moto C : 5,518 " , " Moto Z2 Play : 26,499/10% " };  
for(i=0;i<9;i++)   
System.out.println( (i+1) + "." + MOT[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
motb=Integer.parseInt(br.readLine());
if(motb!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
cmot=Integer.parseInt(br.readLine());
if(cmot!=0);
{
if(cmot==1);
{    
System.out.println( MOT[motb-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you in 7-10 business days " );
System.out.println( " Thank you for shopping :-) " );
}
if((cmot!=0)&&(cmot!=1))
System.out.println( " Wrongly Entered ! " );
}
}
if(motb==0)
System.out.println( " Thank you for visiting " );
if(motb>9)
System.out.println( " Wrong Choice ! " );
}
if(mb==8)
{
System.out.println( " This the best camera phone brand , OPPO " );
System.out.println( "         The Art of Technology           " );
System.out.println( " The products are displayed in the format - Product:Price/Discount% " ); 
String OPP[]={ " Oppo F5 : 19,990 " , " Oppo A57 : 13,990/12% " , " Oppo A37 : 9,990/9% " , " Oppo F3 : 18,990/9% " , " Oppo F1s : 17,200 " , " Oppo A71 : 12,990/3% " , " Oppo F1 Plus : 21,000 " };  
for(i=0;i<7;i++)   
System.out.println( (i+1) + "." + OPP[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
oppb=Integer.parseInt(br.readLine());
if(oppb!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
copp=Integer.parseInt(br.readLine());
if(copp!=0);
{
if(copp==1);
{    
System.out.println( OPP[oppb-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you in 7-10 business days " );
System.out.println( " Thank you for shopping :-) " );
}
if((copp!=0)&&(copp!=1))
System.out.println( " Wrongly Entered ! " );
}
}
if(oppb==0)
System.out.println( " Thank you for visiting " );
if(oppb>9)
System.out.println( " Wrong Choice ! " );
}
if(mb==9)
{
System.out.println( " This the flashy brand , VIVO " );
System.out.println( "        Perfect Selfie        " );
System.out.println( " The products are displayed in the format - Product:Price/Discount% " );  
String VIV[]={ " Vivo V7+ : 21,990 " , " Vivo V5s : 17,990/10% " , " Vivo V5 Plus : 19,990/28% " , " Vivo V3 : 13,500 " , " Vivo V3 Max : 17,999 " , " Vivo V55L : 13,500 " , " Vivo Y55s : 11,990/11% " , " Vivo V1 : 13,731 " };  
for(i=0;i<8;i++)   
System.out.println( (i+1) + "." + VIV[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
vivb=Integer.parseInt(br.readLine());
if(vivb!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
cviv=Integer.parseInt(br.readLine());
if(cviv!=0);
{
if(cviv==1);
{    
System.out.println( VIV[vivb-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you in 7-10 business days " );
System.out.println( " Thank you for shopping :-) " );
}
if((cviv!=0)&&(cviv!=1))
System.out.println( " Wrongly Entered ! " );
}
}
if(vivb==0)
System.out.println( " Thank you for visiting " );
if(vivb>8)
System.out.println( " Wrong Choice ! " );
}   
if(mb==10)
{
System.out.println( " This is the brand of great roots , NOKIA " );
System.out.println( "         Connecting People          " );
System.out.println( " The products are displayed in the format - Product:Price/Discount% " ); 
String NOK[]={ " Nokia 8 : 36,999 " , " Nokia 6 : 14,999/12% " , " Nokia 5 : 12,599 " , " Nokia 3 8,800/14% " , " Nokia 3310 : 3,310 " , " Nokia 150 : 2,110 " , " Nokia 105 : 1,133/5% " };    
for(i=0;i<7;i++)   
System.out.println( (i+1) + "." + NOK[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
nokb=Integer.parseInt(br.readLine());
if(nokb!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
cnok=Integer.parseInt(br.readLine());
if(cnok!=0);
{
if(cnok==1);
{    
System.out.println( NOK[nokb-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you in 7-10 business days " );
System.out.println( " Thank you for shopping :-) " );
}
if((cnok!=0)&&(cnok!=1))
System.out.println( " Wrongly Entered ! " );
}
}
if(nokb==0)
System.out.println( " Thank you for visiting " );
if(nokb>7)
System.out.println( " Wrong Choice ! " );
}
if(mb==11)
{
System.out.println( " This is the king of Laptops' Brand , DELL " );
System.out.println( "            Dell . Purely You              " );
System.out.println( " The products are displayed in the format - Product Size Core/RAM/ROM:Price/Discount% " );    
String DEL[]={ " Dell XPS 13 13.3-inch i7/16GB/512GB : 149,999 " , " Dell Inpiron 5767 17.3-inch i7/16GB/2TB : 99,999 " , " Dell Inspiron 7460 14-inch i5/8GB/1TB : 59,890 " , " Dell Inspiron 5567 15.6-inch i5/8GB/1TB : 46,890/9% " , " Dell Inspiron 7378 Touchscreen 13.3-inch i7/8GB/256GB : 77,993 " };
for(i=0;i<5;i++)   
System.out.println( (i+1) + "." + DEL[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
delb=Integer.parseInt(br.readLine());
if(delb!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
cdel=Integer.parseInt(br.readLine());
if(cdel!=0);
{
if(cdel==1);
{    
System.out.println( DEL[delb-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you in 7-10 business days " );
System.out.println( " Thank you for shopping :-) " );
}
if((cdel!=0)&&(cdel!=1))
System.out.println( " Wrongly Entered ! " );
}
}
if(delb==0)
System.out.println( " Thank you for visiting " );
if(delb>5)
System.out.println( " Wrong Choice ! " );
}
if(mb==12)
{       
System.out.println( " Splitted by Hewlett Packard , the HP " );
System.out.println( "            Make It Matter            " );
System.out.println( " The products are displayed in the format - Product Size Core/RAM/ROM:Price/Discount% " ); 
String HP[]={ " HP Omen W 250TX 17.3-inch i7/16GB/1TB+256GB SSD : 169,990/6% " , " HP Spectre x360 Convertible 13.3-inch i7/16GB/512GB : 159,990 " , " HP Envy 13 13.3-inch i5/8GB/256GB : 76,990 " , " HP Pavillion 13 x360 13.3-inch i5/8GB/1TB : 64,968 " }; 
for(i=0;i<4;i++)   
System.out.println( (i+1) + "." + HP[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
hpb=Integer.parseInt(br.readLine());
if(hpb!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
chp=Integer.parseInt(br.readLine());
if(chp!=0);
{
if(chp==1);
{    
System.out.println( HP[hpb-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you in 7-10 business days " );
System.out.println( " Thank you for shopping :-) " );
}
if((chp!=0)&&(chp!=1))
System.out.println( " Wrongly Entered ! " );
}
}
if(hpb==0)
System.out.println( " Thank you for visiting " );
if(hpb>4)
System.out.println( " Wrong Choice ! " );
}        
if(mb==13)
{
System.out.println( " This is the pride of the richest man on the Earth , MICROSOFT " );
System.out.println( "                     Empowering Us All                         " );
System.out.println( " The laptops are displayed in the format - Product Size Core/RAM/ROM:Price/Discount% " );
System.out.println( " Other products are displayed in the format - Product:Price/Discount% " );
String MIC[]={ " Microsoft Surface Pro 4 Touchscreen 12.3-inch i7/16GB/512GB : 186,000 " , " Microsoft Surface Platinum 13.5-inch i5/8GB/256GB : 152,125 " , " Microsoft Office Home and Student : 5,899 " , " Microsoft Office 365 Personal : 3,189 " , " Microsoft Xbox One S 1TB : 32,600/7% " , " Microsoft Xbox One S 500GB : 27,989/7% " , " Microsoft Xbox 360 4GB : 14,499/9% " };
for(i=0;i<7;i++)   
System.out.println( (i+1) + "." + MIC[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
micb=Integer.parseInt(br.readLine());
if(micb!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
cmic=Integer.parseInt(br.readLine());
if(cmic!=0);
{
if(cmic==1);
{    
System.out.println( MIC[micb-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you in 7-10 business days " );
System.out.println( " Thank you for shopping :-) " );
}
if((cmic!=0)&&(cmic!=1))
System.out.println( " Wrongly Entered ! " );
}
}
if(micb==0)
System.out.println( " Thank you for visiting " );
if(micb>7)
System.out.println( " Wrong Choice ! " );
}        
if(mb==14)
{
System.out.println( " This is the brand famous worldwide , ACER " );
System.out.println( "          Explore Beyond Limits            " );
System.out.println( " The products are displayed in the format - Product Size Core/RAM/ROM:Price/Discount% " );     
String ACE[]={ " Acer Spin 7 14-inch i7/8GB/256GB : 95,000/24% " , " Acer Aspire NX.M8NSI.OO7 Touchscreen 11.6-inch i3/4GB/60GB : 68,999 " , " Acer Aspire 3 15.6-inch i3/4GB/1TB : 26,990/23% " };
for(i=0;i<3;i++)   
System.out.println( (i+1) + "." + ACE[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
aceb=Integer.parseInt(br.readLine());
if(aceb!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
cace=Integer.parseInt(br.readLine());
if(cace!=0);
{
if(cace==1);
{    
System.out.println( ACE[aceb-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you in 7-10 business days " );
System.out.println( " Thank you for shopping :-) " );
}
if((cace!=0)&&(cace!=1))
System.out.println( " Wrongly Entered ! " );
}
}
if(aceb==0)
System.out.println( " Thank you for visiting " );
if(aceb>3)
System.out.println( " Wrong Choice ! " );
}        
if(mb==15)
{
System.out.println( " This is the Taiwanese multinational company , ASUS " );
System.out.println( "               In Search of Incredible              " );
System.out.println( " The Mobiles are displayed in the format - Product:Price/Discount% " );
System.out.println( " The Laptops are displayed in the format - Product Size Core/RAM/ROM:Price/Discount% " );
String ASU[]={ " Asus Zenfone 3 Deluxe : 50,999 " , " Asus Zenfone 5 : 21,999 " , " Asus Zenfone 2 : 14,999/25% " , " Asus Zenfone 3 : 13,790/40% " , " Asus Zenfone 3 Max : 12,900/32% " , " Asus Zenfone 3 Laser : 13,399 " , " Asus Zenfone 2 Laser : 12,319 " , " Asus GL502VM-FY23OT 15.6-inch i7/8GB/1TB : 145,079 " , " Asus ROG 15.6-inch i7/8GB/1TB : 86,200/14% " , " Asus T101HA-GR007T Touchscreen 10.1-inch Atomx5-Z8350/2GB/64GB : 20,990 " };
for(i=0;i<10;i++)   
System.out.println( (i+1) + "." + ASU[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
asub=Integer.parseInt(br.readLine());
if(asub!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
casu=Integer.parseInt(br.readLine());
if(casu!=0);
{
if(casu==1);
{    
System.out.println( ASU[asub-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you in 7-10 business days " );
System.out.println( " Thank you for shopping :-) " );
}
if((casu!=0)&&(casu!=1))
System.out.println( " Wrongly Entered ! " );
}
}
if(asub==0)
System.out.println( " Thank you for visiting " );
if(asub>10)
System.out.println( " Wrong Choice ! " );
}
else
System.out.println( " Wrong Choice ! " );       
break;
case 2:
System.out.println( " Welcome to TV , Appliances and Electronics " );
System.out.println( " In this category you can shop for top brands and numerous variety " );
String EC[]={ " Televisions " , " Refridgerators " , " Washing Machines " , " Air Conditioners " , " Heating and Cooling " , " Music and Entertainment " , " Cameras " };
System.out.println( " The available sub-categories are : " );
for(i=0;i<7;i++)
System.out.println( (i+1) + EC[i] );
System.out.println( " Please enter the sub-categorie you want to shop for using their respective numbers " ); 
eb=Integer.parseInt(br.readLine());
if(eb==1)
{
System.out.println( " Welcome to the bright shop of TELEVISIONS " );
System.out.println( " The Televisions are displayed in the format - Product Size/Resolution/Type : Price/Discount% " );
String TV[]={ " Samsung UA49KS7000KLXL-SF 49-inch/4K Ultra HD/LED TV : 166,990 " , " Samsung QA65Q7F 65-inch/Ultra HD/ Smart QLED Curved : 379,900 " , " Samsung Series 5 49-inch/Full HD/LED Smart TV : 64,900/21% " , " Sony Bravia KD 55-inch/4K Ultra HD/LED Smart TV : 164,900 " , " Sony Bravia KLV-40W562D 40-inch/Full HD/LED Smart TV : 42,990/20% " , " BPL Steller 123E36S4C 49-inch/4K Ultra HD/LED Smart TV : 45,990/4% " , " Panasonic Viera TH 65-inch/4K UHD/LED TV : 169,666/37% " , " Panasonic TH-49DS630D 49-inch/Full HD/LED Smart IPS TV : 59,000/25% " , " LG OLED55B7T 55-inch/4K OLED/Smart TV : 244,000 " , " LG 55LJ550T 55-inch/Full HD/LED Smart TV : 77,606/25% " }; 
for(i=0;i<10;i++)   
System.out.println( (i+1) + "." + TV[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
tvb=Integer.parseInt(br.readLine());
if(tvb!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
ctv=Integer.parseInt(br.readLine());
if(ctv!=0);
{
if(ctv==1);
{    
System.out.println( TV[tvb-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you in 7-10 business days " );
System.out.println( " Thank you for shopping :-) " );
}
if((ctv!=0)&&(ctv!=1))
System.out.println( " Wrongly Entered ! " );
}
}
if(tvb==0)
System.out.println( " Thank you for visiting " );
if(tvb>10)
System.out.println( " Wrong Choice ! " );
}
if(eb==2)
{
System.out.println( " Welcome to the freezing shop of REFRIDGERATORS " );
System.out.println( " The Refridgerators are displayed in the format - Product Capacity/Type/Rating:Price/Discount% " );
String REF[]={ " Samsung Frost Free 253L/Single Door/2 Star : 24,599/11% " , " Samsung Smart Convertible 637L/Double Door/3 Star : 77,649/10% " , " Samsung Frost Free 545L/Side-by-Side/3 Star : 71,390/20% " , " Godrej Direct Cool 210L/Single Door/3 Star : 16,490 " , " Godrej Frost Free 343L/Double Door/3 Star : 36,360 " , " Whirlpool Direct Cool 280L/Single Door/3 Star : 20,990/19% " , " Whirlpool Frost Free 440L/Double Door/3 Star : 49,990/16% " , " Whirlpool Frost Free 330L/Multi Door/2 Star : 35,699/13% " , " LG Direct Cool 190L/Single Door/3 Star : 13,599/14% " , " LG Frost Free 495L/Double Door/4 Star : 57,990 " , " LG Frost Free 687L/Side-by-Side/2 Star : 67,999/25% " , " Haier Direct Cool 195L/Single Door/4 Star : 14,999 " , " Haier Frost Free 345L/Double Door/3 Star : 32,990/31% " , " Haier Frost Free 565L/Side-by-Side/2 Star : 51,900 " , " BPL Frost Free 564L/Side-by-Side/2 Star : 49,990/24% " , " Mitashi DIrect Cool 87L/Single Door/2 Star : 7,990/4% " , " Mitashi Direct Cool 240L/Double Door/3 Star : 16,990/19% " , " Bosch Frost Free 505L/Double Door/2 Star : 69,999 " , " Gem Direct Cool 180L/Single Door/2 Star : 9,690/13% " };   
for(i=0;i<19;i++)   
System.out.println( (i+1) + "." + REF[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
refb=Integer.parseInt(br.readLine());
if(refb!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
cref=Integer.parseInt(br.readLine());
if(cref!=0);
{
if(cref==1);
{    
System.out.println( REF[refb-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you in 7-10 business days " );
System.out.println( " Thank you for shopping :-) " );
}
if((cref!=0)&&(cref!=1))
System.out.println( " Wrongly Entered ! " );
}
}
if(refb==0)
System.out.println( " Thank you for visiting " );
if(refb>19)
System.out.println( " Wrong Choice ! " );
}   
if(eb==3)
{
System.out.println( " Welcome to the Foamy shop of WASHING MACHINES " );
System.out.println( " The Washing Machines are displayed in the format - Product Capacity/Load Type/Automatacity : Price/Discount% " );
String WAS[]={ " Bosch Washer Dryer 8kg/Front Load/Fully Automatic : 54,590/13% " , " Godrej WT EON 6.5kg/Top Load/Fully Automatic : 23,990/13% " , " Haier Washing Machine 7.2kg/Top Load/Fully Automatic : 23,990 " , " Haier HW70 7kg/Front Load/Fully Automatic : 29,237/16% " , " IFB TLSDG 9.5kg/Top Load/Fully Automatic : 32,940 " , " IFB Senator Smart 7kg/Front Load/Fully Automatic : 41,590 " , " LG P9042R3SM 8kg/Top Load/Semi Automatic : 14,990/8% " , " LG T1077TEEL1 9kg/Top Load/Fully Automatic : 37,600 " , " LG Luxury 8kg/Front Load/Fully Automatic : 44,929/14% " , " Samsung TL 7.5kg/Top Load/Semi Automatic : 12,390/14% " , " Samsung TL 9kg/Top Load/Fully Automatic : 32,599/6% " , " Samsung Crystal Glass 9kg/Front Load/Fully Automatic : 59,990/5% " , " Whirlpool Ace Turbodry 8.5kg/Top Load/Semi Automatic : 13,240/9% " , " Whirlpool Bloomwash World Series 8kg/Top Load/Fully Automatic : 29,990/12% " , " Noblble Skiodo Twin Tub 8kg/Top Load/Semi Automatic : 8,690/3% " , " Intex Washfoam 7.6kg/Top Load/Semi Automatic : 9,490 " };
for(i=0;i<16;i++)   
System.out.println( (i+1) + "." + WAS[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
wasb=Integer.parseInt(br.readLine());
if(wasb!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
cwas=Integer.parseInt(br.readLine());
if(cwas!=0);
{
if(cwas==1);
{    
System.out.println( WAS[wasb-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you in 7-10 business days " );
System.out.println( " Thank you for shopping :-) " );
}
if((cwas!=0)&&(cwas!=1))
System.out.println( " Wrongly Entered ! " );
}
}
if(wasb==0)
System.out.println( " Thank you for visiting " );
if(wasb>19)
System.out.println( " Wrong Choice ! " );
}        
if(eb==4)
{
System.out.println( " Welcome to the Cool shop of AIR CONDITIONERS " );
System.out.println( " The Air Conditioners are displayed in the format - Product Weight/Type/Rating/Inverter Type : Price/Discount% " );
String AIR[]={ " LG JS-Q18AFXD 1.5-Ton/Split AC/3 Star/Dual Inverter : 46,690 " , " LG L-Crescent Plus 1.5-Ton/Window AC/5 Star : 32,900 " , " Voltas 185 EYS 1.5-Ton/Split AC/5 Star : 37,530/18% " , " Voltas Magana Y Series 1.5-Ton/Window AC/5 Star : 37,800 " , " Carrier CACI18SU4I1 1.5-Ton/Split AC/4 Star/Single Inverter : 40,999/24% " , " Carrier 24K Estrella Plus 2-Ton/Window AC/3 Star : 35,800 " , " Kenstar KSZ55 1.5-Ton/Split AC/5 Star : 25,490/14% " , " BPL BAC18K5AHL 1.5-Ton/Split AC/5 Star : 26,990/20% " , " Samsung AR18HV 1.5-Ton/Split AC/3 Star/Digital Inverter : 47,600 " }; 
for(i=0;i<9;i++)   
System.out.println( (i+1) + "." + AIR[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
airb=Integer.parseInt(br.readLine());
if(airb!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
cair=Integer.parseInt(br.readLine());
if(cair!=0);
{
if(cair==1);
{    
System.out.println( AIR[airb-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you in 7-10 business days " );
System.out.println( " Thank you for shopping :-) " );
}
if((cair!=0)&&(cair!=1))
System.out.println( " Wrongly Entered ! " );
}
}
if(airb==0)
System.out.println( " Thank you for visiting " );
if(airb>9)
System.out.println( " Wrong Choice ! " );
}
if(eb==5)
{        
System.out.println( " Welcome to the Warming shop of HEATING and COOLING " );
System.out.println( " The products are displayed in the format - Product : Price/Discount% " );
String HC[]={ " Kent Aura Room Air Purifiers : 9,885/38% " , " Kent Ozone TY-100B Room Air Purifiers : 1,999/50% " , " Havells  PTC Fan Heater : 11,881 " , " LG Puri Care 40-Watt : 53,999/10% " , " Philips 1000 Series Air Purifier : 8,799/26% " , " Panasonic 11-Watt Air Purifiers : 25,490/25% " };
for(i=0;i<6;i++)   
System.out.println( (i+1) + "." + HC[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
hcb=Integer.parseInt(br.readLine());
if(hcb!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
chc=Integer.parseInt(br.readLine());
if(chc!=0);
{
if(chc==1);
{    
System.out.println( HC[hcb-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you in 7-10 business days " );
System.out.println( " Thank you for shopping :-) " );
}
if((chc!=0)&&(chc!=1))
System.out.println ( " Wrongly Entered ! " );
}
}
if(hcb==0)
System.out.println( " Thank you for visiting " );
if(hcb>6)
System.out.println( " Wrong Choice ! " );
}
if(eb==6)
{
System.out.println( " Welcome to the Joyous shop of MUSIC and ENTERTAINMENT" );
System.out.println( " Home Theatre Systems are displayed in the format - Product Type/Connection : Price/Discount% " );
System.out.println( " Other products are displayed in the format - Product : Price/Discount% " );
String MUS[]={ " Sony HT-RT5 SoundBar/Wireless : 54,990 " , " Philips Fidelio HTL9100 SoundBar/Wireless : 39,990/20% " , " Vediocon d2h HD Set Top Box : 1,420/28% " , " Tata Sky HD Set Top Box : 2,049 " , " Sony D-Series Projector : 33,999/18% " , " Sony MDR Headphones : 599,53% " , " Sony SRS-XB2 Bluetooth Speaker : 5,499/38% " };
for(i=0;i<7;i++)   
System.out.println( (i+1) + "." + MUS[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
musb=Integer.parseInt(br.readLine());
if(musb!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
cmus=Integer.parseInt(br.readLine());
if(cmus!=0);
{
if(cmus==1);
{    
System.out.println( MUS[musb-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you in 7-10 business days " );
System.out.println( " Thank you for shopping :-) " );
}
if((cmus!=0)&&(cmus!=1))
System.out.println ( " Wrongly Entered ! " );
}
}
if(musb==0)
System.out.println( " Thank you for visiting " );
if(musb>7)
System.out.println( " Wrong Choice ! " );
}
if(eb==7)
{
System.out.println( " Welcome to the Posing shop of CAMERAS " );
System.out.println( " The Cameras are displayed in the format - Product Type/OpticalZoom : Price/Discount% " );
String CAM[]={ " Canon EOS 700D DSLR/18MP: 44,990 " , " Nikon D7200 DSLR/24.2MP : 73,750/18% " , " Nikon D3400 DSLR/24.2MP : 28,987/22% " , " Sony Cyber-Shot DSC-HX300 Point-and-Shoot/20.4MP : 65,902 " , " Sony Cyber-Shot DSC-HX90V Point-and-Shoot/18.2MP " , " Sony Alpha A6000L Compact/24.3MP " };
for(i=0;i<6;i++)   
System.out.println( (i+1) + "." + CAM[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
camb=Integer.parseInt(br.readLine());
if(camb!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
ccam=Integer.parseInt(br.readLine());
if(ccam!=0);
{
if(ccam==1);
{    
System.out.println( CAM[camb-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you in 7-10 business days " );
System.out.println( " Thank you for shopping :-) " );
}
if((ccam!=0)&&(ccam!=1))
System.out.println ( " Wrongly Entered ! " );
}
}
if(camb==0)
System.out.println( " Thank you for visiting " );
if(camb>6)
System.out.println( " Wrong Choice ! " );
}
else
System.out.println( " Wrong Choice ! " );
break;
case 3:
System.out.println( " Welcome to Home and Kitchen " );
System.out.println( " In this category you can shop for numerous Home and Kitchen Appliances which bring up your Cozy Mommy Memories " );
String HC[]={ " Cookware " , " Crockery " , " Gas Stoves " , " Home Decor " , " Indoor Lighting " };
System.out.println( " The available sub-categories are : " );
for(i=0;i<5;i++)
System.out.println( (i+1) + HC[i] );
System.out.println( " Please enter the sub-categorie you want to shop for using their respective numbers " ); 
hb=Integer.parseInt(br.readLine());
if(hb==1)
{
System.out.println( " Welcome to the Sizzling shop of COOKWARE " );
System.out.println( " The products are displayed in the format - Product : Price/Discount% " );
String COO[]={ " Prestige Clip-On Pressure Cooker 5L - 3,571 " , " Prestige Deluxe Plus Pressure Cooker 7.5L - 3,290 " , " Prestige Omega Deluxe Fry Pan 26cm - 3,999 " , " Home Creations Double Side Fry Pan 36cm - 1,899 " , " Prestige Tru-Edge Knife Set : 522/10% " };   
for(i=0;i<5;i++)   
System.out.println( (i+1) + "." + COO[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
coob=Integer.parseInt(br.readLine());
if(coob!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
ccoo=Integer.parseInt(br.readLine());
if(ccoo!=0);
{
if(ccoo==1);
{    
System.out.println( COO[coob-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you in 7-10 business days " );
System.out.println( " Thank you for shopping :-) " );
}
if((ccoo!=0)&&(ccoo!=1))
System.out.println ( " Wrongly Entered ! " );
}
}
if(coob==0)
System.out.println( " Thank you for visiting " );
if(coob>5)
System.out.println( " Wrong Choice ! " );
}
if(hb==2)
{
System.out.println( " Welcome to the Crackling shop of CROCKERY " );
System.out.println( " Dinner Sets are displayed in the format - Product , No. of pieces : Price/Discount% " );
System.out.println( " Other products are displayed in the format - Product : Price/Discount% " );     
String CRO[]={ " Cello Imperial Oplaware Dinner Set , 33 Pieces : 3,595 " , " CelloWare Round Dinner Set , 32 Pieces : 1,689 " , " LaOpala Diva Dinner Set , 33 Pieces : 3,590 " , " LaOpala Classique Dinner Set , 27 Pieces : 2,924/11% " , " LaOpala Aevlon Dinner Set , 33 Pieces : 3,495 " , " LaOpala Cup and Saucer : 747 " , " Cello Prego Venice Coffee Mug : 284/5% " };   
for(i=0;i<7;i++)   
System.out.println( (i+1) + "." + CRO[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
crob=Integer.parseInt(br.readLine());
if(crob!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
ccro=Integer.parseInt(br.readLine());
if(ccro!=0);
{
if(ccro==1);
{    
System.out.println( CRO[crob-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you in 7-10 business days " );
System.out.println( " Thank you for shopping :-) " );
}
if((ccro!=0)&&(ccro!=1))
System.out.println ( " Wrongly Entered ! " );
}
}
if(crob==0)
System.out.println( " Thank you for visiting " );
if(crob>7)
System.out.println( " Wrong Choice ! " );
}    
if(hb==3)
{
System.out.println( " Welcome to the Burning shop of GAS STOVES " );
System.out.println( " The Gas Stoves are displayed in the format - Product , No. of Burners : Price/Discount% " );
String GAS[]={ " Prestige Premia Gas Stove , 2 Burner : 5,750/25% " , " Pegion Blackline Square SS Gas Stove , 2 Burner : 4,795/23% " , " Prestige Premia Schott Gold , 3 Burner : 8,055/25% " , " Pegion Blackline Oval SS Gas Stove , 3 Burner : 6,535/23% " , " Prestige Premia GTS Gas Stove , 4 Burner : 8,999/27% " , " Pegion Blackline Oval SS Gas Stove , 4 Burner : 8,549/10% " , " Prestige Hobtop Gas Stove , 4 Burner : 12,399/34% " , " Pegion Hobtop Gas Stove , 3 Burner : 12,047 " };
for(i=0;i<8;i++)   
System.out.println( (i+1) + "." + GAS[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
gasb=Integer.parseInt(br.readLine());
if(gasb!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
cgas=Integer.parseInt(br.readLine());
if(cgas!=0);
{
if(cgas==1);
{    
System.out.println( GAS[gasb-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you in 7-10 business days " );
System.out.println( " Thank you for shopping :-) " );
}
if((cgas!=0)&&(cgas!=1))
System.out.println ( " Wrongly Entered ! " );
}
}
if(gasb==0)
System.out.println( " Thank you for visiting " );
if(gasb>8)
System.out.println( " Wrong Choice ! " );
} 
if(hb==4)
{  
System.out.println( " Welcome to the Hommie shop of HOME DECOR " );
System.out.println( " The products are displayed in the format - Product : Price/Discount% " );
String HOM[]={ " Decals Design Sticker : 199 " , " eCrafrtIndia Ganesh Deepak : 862 " , " Story@Home Picture : 249 " , " Painting Mantra Sunrise Canvas : 4,950 " };
for(i=0;i<4;i++)   
System.out.println( (i+1) + "." + HOM[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
homb=Integer.parseInt(br.readLine());
if(homb!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
chom=Integer.parseInt(br.readLine());
if(chom!=0);
{
if(chom==1);
{    
System.out.println( HOM[homb-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you in 7-10 business days " );
System.out.println( " Thank you for shopping :-) " );
}
if((chom!=0)&&(chom!=1))
System.out.println ( " Wrongly Entered ! " );
}
}
if(homb==0)
System.out.println( " Thank you for visiting " );
if(homb>4)
System.out.println( " Wrong Choice ! " );
}  
if(hb==5)
{
System.out.println( " Welcome to the Shining shop of INDOOR LIGHTING " );
System.out.println( " The products are displayed in the format - Product : Price/Discount% " );     
String LIT[]={ " Philips SELV LED Bar : 3,700 " , " Generic Decorative Filament Bulb : 294 " , " Generic Vintage Edison Tungston Filament Bulb : 250 " , " Eveready ELS LED Bulb : 549 " , " Philips Ojas Rechargable LED Lantern : 1,450/38% " , " 90 Degree Diffused LED Night Light : 350/12% " };
for(i=0;i<6;i++)   
System.out.println( (i+1) + "." + LIT[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
litb=Integer.parseInt(br.readLine());
if(litb!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
clit=Integer.parseInt(br.readLine());
if(clit!=0);
{
if(clit==1);
{    
System.out.println( LIT[litb-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you in 7-10 business days " );
System.out.println( " Thank you for shopping :-) " );
}
if((clit!=0)&&(clit!=1))
System.out.println ( " Wrongly Entered ! " );
}
}
if(litb==0)
System.out.println( " Thank you for visiting " );
if(litb>6)
System.out.println( " Wrong Choice ! " );
}    
else
System.out.println( " Wrong Choice ! " );
break;
case 4:
System.out.println( " Welcome to Grocery " );
System.out.println( " In this category you can shop for your Daily Needs and other FMCG Goods which will be delivered to you in the shortest time possible " );
String GC[]={ " Fresh Vegetables " , " Fresh Fruits " , " Dairy Eggs and Breakfast " , " Cooking Essentials " , " Beverages " , " Instant Mixes " , " Sauces and Pickels " , " Personel Essentials " , " Household Supplies " };
System.out.println( " The available sub-categories are : " );
for(i=0;i<9;i++)
System.out.println( (i+1) + GC[i] );
System.out.println( " Please enter the sub-categorie you want to shop for using their respective numbers " ); 
gb=Integer.parseInt(br.readLine());
if(gb==1)
{
System.out.println( " Welcome to the Healthy Shop of FRESH VEGETABLES " );
System.out.println( " The products are displayed in the format - Product/Quantity : Price/Discount% " );   
String FV[]={ " Fresh Onions/1kg : 50 " , " Fresh Potato/1kg : 20 " , " Fresh Coriander Leaf/1 Bunch : 4/60% " , " Fresh Palak Leaves/1 Bunch : 6/33% " , " Fresh Ladyfinger/500g : 23 " , " Fresh Tomato/1kg : 43 " , " Fresh Ginger/100g : 8 " , " Fresh French Beans/250g : 14 " , " Fresh Lemon/100g : 7 " , " Fresh Capsicum/500g : 35 " , " Fresh Curry Leaf/1 Bunch : 5 " , " Fresh Beet Root/250g : 18 " };
for(i=0;i<12;i++)   
System.out.println( (i+1) + "." + FV[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
fvb=Integer.parseInt(br.readLine());
if(fvb!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
cfv=Integer.parseInt(br.readLine());
if(cfv!=0);
{
if(cfv==1);
{    
System.out.println( FV[fvb-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you within 2 hours " );
System.out.println( " Thank you for shopping :-) " );
}
if((cfv!=0)&&(cfv!=1))
System.out.println ( " Wrongly Entered ! " );
}
}
if(fvb==0)
System.out.println( " Thank you for visiting " );
if(fvb>12)
System.out.println( " Wrong Choice ! " );
}    
if(gb==2)
{
System.out.println( " Welcome to the Juicy shop of FRESH FRUITS " );
System.out.println( " The products are displayed in the format - Product/Quantity : Price/Discount% " );   
String FF[]={ " Fresh Robusta Banana/500g : 17 " , " Fresh Lemon/100g : 7 " , " Fresh Yelakki Banana/500g : 38 " , " Fresh Nagpur Orange/500g : 32 " , " Fresh Coconut/1 Piece : 30 " , " Fresh Papaya/1kg : 29 " , " Fresh Premium Pomegrnate/1kg : 90 " , " Fresh Guava/500g : 55 " , " Fresh Kashmir Apple/1kg : 136 " , " Fresh Sweet Lime/500g : 43 " , " Fresh Pineapple/1 Piece : 29 " , " Fresh Zespri Green Kiwi/1 Piece : 24 " , " Fresh Granny Smith Green Apple/1kg : 299 " , " Spar Fresh Golden Pear/4 Pieces : 159 " , " Fresh Plum/150 " };
for(i=0;i<15;i++)   
System.out.println( (i+1) + "." + FF[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
ffb=Integer.parseInt(br.readLine());
if(ffb!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
cff=Integer.parseInt(br.readLine());
if(cff!=0);
{
if(cff==1);
{    
System.out.println( FF[ffb-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you within 2 hours " );
System.out.println( " Thank you for shopping :-) " );
}
if((cff!=0)&&(cff!=1))
System.out.println ( " Wrongly Entered ! " );
}
}
if(ffb==0)
System.out.println( " Thank you for visiting " );
if(ffb>15)
System.out.println( " Wrong Choice ! " );
}
if(gb==3)
{    
System.out.println( " Welcome to the Routine shop of DAIRY , EGGS AND BREAKFAST " );
System.out.println( " The products are displayed in the format - Product/Quantity : Price/Discount% " ); 
String DAI[]={ " Amul Gold Milk/1L : 66 " , " Fresh Chicken Eggs/6 Pieces : 44 " , " Amul Slice Cheese/10 Slices,200g : 118 " , " Britania Chocolate Cake/50g : 15/50% " , " Amul Taza Milk/1L : 62 " , " Whole Wheat Brown Bread/400g : 30 " , " Amul Garlic Spread Butter/100g : 47 " , " Kissan Mixed Fruit Jam/700g : 155 " , " Amul Lite Butter Spread/200g : 52 " , " Nutella Choco Hazelnut Spread/160g : 215 " , " Dabur Honey/1kg : 342 " , " Easy Slim Ripe Bite Protien Bar/300g : 560 " , " Bonne Maman Strawberry Preserve/370g : 395 " };
for(i=0;i<13;i++)   
System.out.println( (i+1) + "." + DAI[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
daib=Integer.parseInt(br.readLine());
if(daib!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
cdai=Integer.parseInt(br.readLine());
if(cdai!=0);
{
if(cdai==1);
{    
System.out.println( DAI[daib-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you within 2 hours " );
System.out.println( " Thank you for shopping :-) " );
}
if((cdai!=0)&&(cdai!=1))
System.out.println ( " Wrongly Entered ! " );
}
}
if(daib==0)
System.out.println( " Thank you for visiting " );
if(daib>13)
System.out.println( " Wrong Choice ! " );
}
if(gb==4)
{
System.out.println( " Welcome to the Pure shop of COOKING ESSENTIALS " );
System.out.println( " The products are displayed in the format - Product/Quantity : Price/Discount% " );     
String CE[]={ " Pure Cow's Ghee/500ml : 223 " , " Madhur Pure Sugar/1kg : 53 " , " Fortune Sunlite Refined Sunflower Oil/1L : 86 " , " Borges Olive Oil/2L : 2,350 " , " Tata Salt Lite/1kg : 30 " , " Saffola Gold Edible Oil/5L : 729 " , " Golden Harvest Daily Sugar/1kg : 50 " , " Aashirvaad Whole Wheat Flour/5kg : 221 " , " Daawat Brown Basmati Rice/1kg : 155 " , " Everest Turmeric Powder/100g : 26 " , " Aashirvaad Multigrains Flour/5kg : 250 " , " Aashirvaad Iodised Salt/1kg : 17 " , " Daawat Biryani Basmati Rice/5kg : 1,140 " , " Delmonte Olive Pomance Oil/5L : 4,500 " };
for(i=0;i<14;i++)   
System.out.println( (i+1) + "." + CE[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
ceb=Integer.parseInt(br.readLine());
if(ceb!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
cce=Integer.parseInt(br.readLine());
if(cce!=0);
{
if(cce==1);
{    
System.out.println( CE[ceb-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you within 2 hours " );
System.out.println( " Thank you for shopping :-) " );
}
if((cce!=0)&&(cce!=1))
System.out.println ( " Wrongly Entered ! " );
}
}
if(ceb==0)
System.out.println( " Thank you for visiting " );
if(ceb>14)
System.out.println( " Wrong Choice ! " );
}
if(gb==5)
{
System.out.println( " Welcome to the Flowing shop of BEVERAGES " );
System.out.println( " The products are displayed in the format - Product/Quantity : Price/Discount% " );        
String BEV[]={ " Bru Gold Coffee/100g : 285 " , " Bournvita/1kg : 350 " , " Lipton Green Tea Bags/100 Pieces : 375 " , " Taj Mahal Tea/1kg : 495 " , " Papre Boat Aamrus Juice/1L : 99 " , " Tropicana Cranberry Delight Fruit Juice/1000ml : 110 " , " Nestle Milkmaid/400g : 114 " , " Sofit Sugar Free Soya Milk/1L : 105 " , " Dabur Hommade Coconut Milk/200ml : 75 " , " Lipton Darjeeling Tea/500g : 850 " , " Nescafe Blend 37 Coffee Powder/100g : 1,050 " , " Taj Mahal Saffron/2g : 1,125 " , " Devi Natural Organic Robusta Ground Coffee/250g : 490 " };
for(i=0;i<13;i++)   
System.out.println( (i+1) + "." + BEV[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
bevb=Integer.parseInt(br.readLine());
if(bevb!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
cbev=Integer.parseInt(br.readLine());
if(cbev!=0);
{
if(cbev==1);
{    
System.out.println( BEV[bevb-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you within 2 hours " );
System.out.println( " Thank you for shopping :-) " );
}
if((cbev!=0)&&(cbev!=1))
System.out.println ( " Wrongly Entered ! " );
}
}
if(bevb==0)
System.out.println( " Thank you for visiting " );
if(bevb>13)
System.out.println( " Wrong Choice ! " );
}
if(gb==6)
{
System.out.println( " Welcome to the fast shop of INSTANT MIXES " );   
System.out.println( " The products are displayed in the format - Product/Quantity : Price/Discount% " );   
String INS[]={ " ID Idly and Dosa Batter/1kg : 70 " , " Knorr Tomato Chatpata Soup/16g : 10 " , " Smith and Jones Ginger Garlic Paste/200g : 40 " , " Nutrela Soya Chunks/40 : 220g " , " MTR Instant Plain Upma Mix/170g : 35 " , " Maggi Noodels-Meri Masala/70g : 12 " , " MTR Rawa Idli Snack Mix/200g : 52 " , " Ching's Singapore Curry Noodles/60g : 10 " , " Funfoods Veg Mayonnase Spread/100g : 35 " , " Knorr Mexican Tomato Corn International Soup/52g : 45 " , " Knorr Mast Masala Soupy Noodles/154g : 30 " , " John West Tuna Steaks/160g : 500 " , " John West Tuna Chunks/160g : 490 " };  
for(i=0;i<13;i++)   
System.out.println( (i+1) + "." + INS[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
insb=Integer.parseInt(br.readLine());
if(insb!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
cins=Integer.parseInt(br.readLine());
if(cins!=0);
{
if(cins==1);
{    
System.out.println( INS[insb-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you within 2 hours " );
System.out.println( " Thank you for shopping :-) " );
}
if((cins!=0)&&(cins!=1))
System.out.println ( " Wrongly Entered ! " );
}
}
if(insb==0)
System.out.println( " Thank you for visiting " );
if(insb>13)
System.out.println( " Wrong Choice ! " );
}
if(gb==7)
{
System.out.println( " Welcome to the Spiced shop of Sauces and Pickels " );
System.out.println( " The products are displayed in the format - Product/Quantity : Price/Discount% " );       
String SAU[]={ " Ching's Sezwan Chutney/250g : 60 " , " Maggi Hot and Sweet Tomato Chilli Sauce/1kg : 130 " , " Ching's Secret Green Chilli Sauce/190g : 50 " , " Maggi Pichkoo Tomato Ketchup/90g : 15 " , " Tasty Treat Tomato Ketchup/1kg : 95 " , " Dabur Hommade Pure Tomato Paste/200g : 25 " , " Ching's Superior Dark Soy Sauce/200g : 50 " , " Ching's Red Chilli Sauce/200g : 50 " , " Heinz Tomato Ketchup/450g : 99 " , " Fun Foods Traditional English Mustard Sauce/300g : 69 " , " Nando's Medium Peri Peri Sauce/250g : 499 " , " Tabasco Bloody Mary Mix Extra Spicy Sauce/946ml : 475 " };
for(i=0;i<12;i++)   
System.out.println( (i+1) + "." + SAU[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
saub=Integer.parseInt(br.readLine());
if(saub!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
csau=Integer.parseInt(br.readLine());
if(csau!=0);
{
if(csau==1);
{    
System.out.println( SAU[saub-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you within 2 hours " );
System.out.println( " Thank you for shopping :-) " );
}
if((csau!=0)&&(csau!=1))
System.out.println ( " Wrongly Entered ! " );
}
}
if(saub==0)
System.out.println( " Thank you for visiting " );
if(saub>12)
System.out.println( " Wrong Choice ! " );
}
if(gb==8)
{
System.out.println( " Welcome to the Beautiful shop of PERSONAL ESSENTIALS " );
System.out.println( " The products are displayed in the format - Product/Quantity : Price/Discount% " );        
String PER[]={ " TRESemme Smooth and Shine Shampoo/580ml : 385 " , " Parachute 100% Pure Coconut Hair Oil/500ml : 160 " , " Dove Intense Repair Conditioner/170ml : 190 " , " Himalya Anti-Dandruff Shampoo/700ml : 314 " , " VLCC Hairfall Repair Shampoo/350ml : 295 " , " Park Avenue Beer Shampoo/350ml : 250 " , " BBlunt Perfect Balance Shampoo/400ml : 675 " , " Livon Hair Gain Tonic/150ml : 799 " , " Nivea Body Milk Lotion/400ml : 315 " , " Nivea Soft Ligth Moisturising Cream/300ml : 289 " , " Nivea Men Active Clean Shower Gel/250ml : 169 " , " Himalya PureHands Hand Sanitizer/500ml : 300 " };
for(i=0;i<12;i++)   
System.out.println( (i+1) + "." + PER[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
perb=Integer.parseInt(br.readLine());
if(perb!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
cper=Integer.parseInt(br.readLine());
if(cper!=0);
{
if(cper==1);
{    
System.out.println( PER[perb-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you within 2 hours " );
System.out.println( " Thank you for shopping :-) " );
}
if((cper!=0)&&(cper!=1))
System.out.println ( " Wrongly Entered ! " );
}
}
if(perb==0)
System.out.println( " Thank you for visiting " );
if(perb>12)
System.out.println( " Wrong Choice ! " );
} 
if(gb==9)
{
System.out.println( " Welcome to the Sweet shop of HOUSEHOLD SUPPLIES " );
System.out.println( " The products are displayed in the format - Product/Quantity : Price/Discount% " );    
String HOU[]={ " Surf Excel Matic Front Load Detergent Powder/2kg : 435 " , " Vim Dishwash Gel/1L : 199 " , " Harpic Bathroom Cleaner/1L : 156 " , " Good Knight Active+ Machine & Refill/Combo : 85 " , " Godrej aer Home Air Freshner Spray/300ml : 140 " , " Surf Excel Matic Liquid Detergent Top Load/1.02L : 199 " , " Good Knight Fabric Roll-On/8ml : 75 " };
for(i=0;i<7;i++)   
System.out.println( (i+1) + "." + HOU[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
houb=Integer.parseInt(br.readLine());
if(houb!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
chou=Integer.parseInt(br.readLine());
if(chou!=0);
{
if(chou==1);
{    
System.out.println( HOU[houb-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you within 2 hours " );
System.out.println( " Thank you for shopping :-) " );
}
if((chou!=0)&&(chou!=1))
System.out.println ( " Wrongly Entered ! " );
}
}
if(houb==0)
System.out.println( " Thank you for visiting " );
if(houb>7)
System.out.println( " Wrong Choice ! " );
} 
else
System.out.println( " Wrong Choice ! " );
break;
case 5:
System.out.println( " Welcome to Sports and Fitness " );
System.out.println( " In this category you can shop for top brands and numerous variety with adequate products " );
String SC[]={ " Cricket " , " Badminton " , " Cycling " , " Football " };
System.out.println( " The available sub-categories are : " );
for(i=0;i<4;i++)
System.out.println( (i+1) + SC[i] );
System.out.println( " Please enter the sub-categorie you want to shop for using their respective numbers " ); 
sb=Integer.parseInt(br.readLine());
if(sb==1)
{
System.out.println( " Welcome to the shop of CRICKET , the Most Loved Sport of India " );
System.out.println( " The products are displayed in the format - Product/Type : Price/Discount% " );
String CRI[]={ " Gray Nicolls Kaboom Cricket Bat/English Willow : 2,449/30% " , " SS Magnum Bat/English Willow : 2,790 " , " SG Cobra Extreme Bat/English Willow : 3,999/15% " , " MRF Genius Special Virat Kohli Endrosed Bat/English Willow : 15,817/9% " , " New Balance DC 380 Bat/Kashmir Willow : 1,844 " , " MRF Bat/Kashmir Willow : 1,099 " , " SG Spark Bat/Kashmir Willow : 1,499 " , " Set of 4 Pepsi Cricket Balls/Red Leather : 999 " , " Sunley Club Cricket Ball/Red Leather : 899 " , " PSE Sports Cricket Ball/White Leather : 599 " , " CW Cricket Ball/Pink Leather : 340 " , " PS Cricket Hollow Ball/Windball : 445 " };            
for(i=0;i<12;i++)   
System.out.println( (i+1) + "." + CRI[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
crib=Integer.parseInt(br.readLine());
if(crib!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
ccri=Integer.parseInt(br.readLine());
if(ccri!=0);
{
if(ccri==1);
{    
System.out.println( CRI[crib-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you within 7-10 Buisness Days " );
System.out.println( " Thank you for shopping :-) " );
}
if((ccri!=0)&&(ccri!=1))
System.out.println ( " Wrongly Entered ! " );
}
}
if(crib==0)
System.out.println( " Thank you for visiting " );
if(crib>12)
System.out.println( " Wrong Choice ! " );
}
if(sb==2)
{
System.out.println( " Welcome to the shop of BADMINTON , the sport of Extend and Smash " );
System.out.println( " The products are displayed in the format - Product/Type : Price/Discount% " );     
String BAD[]={ " Yonex Force II Badminton Racquet/Voltric Z : 17,100 " , " Yonex 3U-G4 Badminton Raquet/Voltric : 3,434 " , " Yonex Power 29 Lite Badminton Raquet/Muscle : 2,398 " , " Yonew 201 Badminton Raquet/GR : 1,700 " , " Yonex Glanz Badminton Raquet/Nanoary : 12,149/29% " , " Yonex 11 Badminton Raquet/Arcsaber : 14,864/10% " , " Yonex 6000 EX Badminton Raquet/Carbonex : 1,530 " , " Yonnex TR Feather Shuttle Cock/Aeroclub : 1,124/18% " , " Yonex 350 Nylon Shuttle Cock/Mavis : 774 " , " Yonex 40 Shuttle Cock/Aerosena : 3,047 " };   
for(i=0;i<10;i++)   
System.out.println( (i+1) + "." + BAD[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
badb=Integer.parseInt(br.readLine());
if(badb!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
cbad=Integer.parseInt(br.readLine());
if(cbad!=0);
{
if(cbad==1);
{    
System.out.println( BAD[badb-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you within 7-10 Buisness Days " );
System.out.println( " Thank you for shopping :-) " );
}
if((cbad!=0)&&(cbad!=1))
System.out.println ( " Wrongly Entered ! " );
}
}
if(badb==0)
System.out.println( " Thank you for visiting " );
if(badb>10)
System.out.println( " Wrong Choice ! " );
}
if(sb==3)
{
System.out.println( " Welcone to the shop of CYCLING , the vehicle that Changed the World " );
System.out.println( " The products are displayed in the format - Product : Price/Discount% " );
String CYC[]={ " Hercules Roadeo Dual Disc Brake Neon Alloy Bike : 12,500 " , " Hercules Topgear FX100 Speed Bicycle : 10,299 " , " Hero Next 24T Speed Mountain Bike : 6,951/5% " , " Hero Octane 26T Dude Speed Cycle : 10,881 " , " Strauss Cycling Helmet : 849/50% " , " Vector X Cycling Helmet H-40 : 1,220 " , " Schwinn Thrasher Micro Bicycle Helmet : 2,873 " , " Generic Bicycle Chain Cleaner : 450 " , " IShake Hercules Shaker Bottle 700ml : 399 " , " Strauss Cycle Mobile Phone Holder : 265/46% " };
for(i=0;i<10;i++)   
System.out.println( (i+1) + "." + CYC[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
cycb=Integer.parseInt(br.readLine());
if(cycb!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
ccyc=Integer.parseInt(br.readLine());
if(ccyc!=0);
{
if(ccyc==1);
{    
System.out.println( CYC[cycb-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you within 7-10 Buisness Days " );
System.out.println( " Thank you for shopping :-) " );
}
if((ccyc!=0)&&(ccyc!=1))
System.out.println ( " Wrongly Entered ! " );
}
}
if(cycb==0)
System.out.println( " Thank you for visiting " );
if(cycb>10)
System.out.println( " Wrong Choice ! " );
}
if(sb==4)
{
System.out.println( " Welcome to the shop of FOOTBALL , the Most Played Sport in the World " );
System.out.println( " The products are displayed in the format - Product : Price/Discount% " );     
String FOT[]={ " Adidas Men's X 15.4 Football Boots : 3,400 " , " Nike Jr. Mercurial Vortex Football Boots : 3,090 " , " Adidad Messi 16.4 FXG Football Boots : 4,999 " , " Adidas Nemeziz Messi 17.4 Fxg Football Boots : 3,999 " , " Adidas Men's Messi 10.1 FG Football Boots : 10,999 " , " Adidas Performance Starlancer V Soccer Ball : 11,510 " , " Nike Paris Saint Germanin Supporters Soccre Ball : 7,809 " };
for(i=0;i<7;i++)   
System.out.println( (i+1) + "." + FOT[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
fotb=Integer.parseInt(br.readLine());
if(fotb!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
cfot=Integer.parseInt(br.readLine());
if(cfot!=0);
{
if(cfot==1);
{    
System.out.println( FOT[fotb-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you within 7-10 Buisness Days " );
System.out.println( " Thank you for shopping :-) " );
}
if((cfot!=0)&&(cfot!=1))
System.out.println ( " Wrongly Entered ! " );
}
}
if(fotb==0)
System.out.println( " Thank you for visiting " );
if(fotb>7)
System.out.println( " Wrong Choice ! " );
} 
else 
System.out.println( " Wrong Choice ! " ); 
break;
case 6:
System.out.println( " Welcome to Baby Products " );
System.out.println( " In this category you can shop for your Short n Cute Teddy Bears and Dolls with various to products choose from and a Smile on your face :-) "  );
String CC[]={ " Diapers and Wipes " , " Toys and Games " , " Baby Food " , " Baby Skin Care " , " Feeding Equipment " };
System.out.println( " The available sub-categories are : " );
for(i=0;i<4;i++)
System.out.println( (i+1) + CC[i] );
System.out.println( " Please enter the sub-categorie you want to shop for using their respective numbers " ); 
cb=Integer.parseInt(br.readLine());
if(cb==1)
{
System.out.println( " Welcome to the Hygienic shop of DIAPERS AND WIPES " );
System.out.println( " The Diapers are displayed in the format - Product/Type/Count : Price/Discount% " );
System.out.println( " The Wipes are displayed in the format - Product/Count : Price/Discount% " );
String DIA[]={ " Pampers Diaper Pants/Large/68 : 949 " , " Pampers Daiper Pants/New Born/24 : 255 " , " Pampers Daiper Pants/Medium/80 : 616/35% " , " Pampers Daiper Pants/Extra Large/44 : 561/16% " , " Mamy Poko Pants Extra Absorb Diaper Pants/Medium/74 : 651/30% " , " Mamy Poko Pants Extra Absorb Diaper Pants/Large/62 : 739/20% " , " Mamy Poko Pants Extra Absorb Diaper Pants/Extra Large/54 : 662/28% " , " Mamy Poko Pants Extra Absorb Diaper Pants/New Born/46 : 357/10% " , " Johnson's Baby Skincare Wipes/2*80 : 310/440 " , " Himalya Herbals Gentle Baby Wipes/72 : 124/32% " };       
for(i=0;i<10;i++)   
System.out.println( (i+1) + "." + DIA[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
diab=Integer.parseInt(br.readLine());
if(diab!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
cdia=Integer.parseInt(br.readLine());
if(cdia!=0);
{
if(cdia==1);
{    
System.out.println( DIA[diab-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you within 7-10 Buisness Days " );
System.out.println( " Thank you for shopping :-) " );
}
if((cdia!=0)&&(cdia!=1))
System.out.println ( " Wrongly Entered ! " );
}
}
if(diab==0)
System.out.println( " Thank you for visiting " );
if(diab>10)
System.out.println( " Wrong Choice ! " );   
if(cb==2)
{
System.out.println( " Welcome to the Playing shop of TOYS AND GAMES " );
System.out.println( " The products are displayed in the format - Product : Price/Discount% " );
String TOY[]={ " Funskool Twirly Whirlly Turtle : 164/18% " , " Funskool Digger the Dog : 307/23% " , " Funskool Walk n Drive Truck : 429/14% " , " Funskool Soft Ball : 199 " , " Funskool Activity Ball : 2,462 " };  
for(i=0;i<5;i++)   
System.out.println( (i+1) + "." + TOY[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
toyb=Integer.parseInt(br.readLine());
if(toyb!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
ctoy=Integer.parseInt(br.readLine());
if(ctoy!=0);
{
if(ctoy==1);
{    
System.out.println( TOY[toyb-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you within 7-10 Buisness Days " );
System.out.println( " Thank you for shopping :-) " );
}
if((ctoy!=0)&&(ctoy!=1))
System.out.println ( " Wrongly Entered ! " );
}
}
if(toyb==0)
System.out.println( " Thank you for visiting " );
if(toyb>5)
System.out.println( " Wrong Choice ! " );
}    
if(cb==3)
{
System.out.println( " Welcome to Foddie shop of BABY FOOD " );
System.out.println( " The products are displayed in the format - Product/Age : Price/Discount% " );   
String FOD[]={ " Nestle CERELAC Infant Cereal Stage-1/6-24 Months : 175 " , " Nestle CERELAC Shishu Aahar Infant Cereal Stage-2/8-24 Months : 196 " , " Slurrp Farm Cookies for Babies 75g : 99 " , " Nestle CERELAC Infant Cereal Stage-3/10-24 Months : 216 " , " Nestle CERELAC Infant Cereal Stage-4/12-24 Months : 236 " , " Nestle NESTUM Rice Infant Cereal Stage-1/6-24 Months : 121 " };
for(i=0;i<6;i++)   
System.out.println( (i+1) + "." + FOD[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
fodb=Integer.parseInt(br.readLine());
if(fodb!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
cfod=Integer.parseInt(br.readLine());
if(cfod!=0);
{
if(cfod==1);
{    
System.out.println( FOD[fodb-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you within 7-10 Buisness Days " );
System.out.println( " Thank you for shopping :-) " );
}
if((cfod!=0)&&(cfod!=1))
System.out.println ( " Wrongly Entered ! " );
}
}
if(fodb==0)
System.out.println( " Thank you for visiting " );
if(fodb>6)
System.out.println( " Wrong Choice ! " );
}    
if(cb==4)
{
System.out.println( " Welcome to the Moisturised Shop of BABY SKIN CARE " );
System.out.println( " The products are displayed in the format - Product/Quantity : Price/Discount% " );       
String SKI[]={ " Himalya Herbals Baby Lotion/400ml : 152/41% " , " Himalya Herbals Baby Powder/400g : 117/35% " , " Himalya Baby Cream/200ml : 143/40% " , " Johnson's Baby Cream/100g : 106/21% " , " Mothercare Baby Lotion/300ml : 349 " , " Himalya Herbals Baby Massage Oil/200ml : 144/15% " , " Johnson's Baby Milk Cream/100g : 117/19% " , " Johnson's Baby Oil/500ml : 294/18% " , " Himalya Herbals Babycare Gift Basket : 572/18% " };
for(i=0;i<9;i++)   
System.out.println( (i+1) + "." + SKI[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
skib=Integer.parseInt(br.readLine());
if(skib!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
cski=Integer.parseInt(br.readLine());
if(cski!=0);
{
if(cski==1);
{    
System.out.println( SKI[skib-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you within 7-10 Buisness Days " );
System.out.println( " Thank you for shopping :-) " );
}
if((cski!=0)&&(cski!=1))
System.out.println ( " Wrongly Entered ! " );
}
}
if(skib==0)
System.out.println( " Thank you for visiting " );
if(skib>9)
System.out.println( " Wrong Choice ! " );
}    
if(cb==5)
System.out.println( " Welcome to Dependent shop of FEEDING EQUIPMENT " );
System.out.println( " The products are displayed in the format - Product : Price/Discount% " );     
String FEE[]={ " Single Child Sized Spoon : 1,554 " , " Skip Hoo Zoo Divided Melamine Plate : 701/10% " , " Baybee Baby Feeding Bottle 250ml : 249 " , " Philips Avent Natural Feeding Bottle 2*260ml : 765/14% " , " Philips Avent Classic Soft Spout Cup 200ml : 295 " , " Philips Avent Classic Plus Feeding Bottle 260ml : 313/5% " , " Fisher Price Squeezy Silicon Feeder 125ml : 256 " };
for(i=0;i<7;i++)   
System.out.println( (i+1) + "." + FEE[i] ); 
System.out.println( " Enter the product number you want to buy , if not enter 0 " );
feeb=Integer.parseInt(br.readLine());
if(feeb!=0)
{
System.out.println( " Enter 1 to continue or enter 0 "  );
cfee=Integer.parseInt(br.readLine());
if(cfee!=0);
{
if(cfee==1);
{    
System.out.println( FEE[feeb-1] + " has been bought by you " );
System.out.println( " The product will be delivered to you within 7-10 Buisness Days " );
System.out.println( " Thank you for shopping :-) " );
}
if((cfee!=0)&&(cfee!=1))
System.out.println ( " Wrongly Entered ! " );
}
}
if(feeb==0)
System.out.println( " Thank you for visiting " );
if(feeb>7)
System.out.println( " Wrong Choice ! " );
}    
else
System.out.println( " Wrong Choice ! " );
break;
}
if(c>12)
System.out.println( " Wrong Choice ! " );
}
}
}