package Product.AllProductPrj;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import Dao.ProductDao;
import Entity.Products;


public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	 int n,s,c;
    	 
         System.out.println("Press 1 to continue as customer or \nPress 2 to continue as Shopkeeper");
         Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
         if(n==1)
         { 
             System.out.println("Welcome Customer\n");
             System.out.println("Press 1 to View List\nPress 2 to Buy Product by Product id\n");
             c=sc.nextInt();
             switch(c)
             {
                 case 1:
                	 ProductDao pd=new ProductDao();
                     List<Products> allUser = pd.getAllUser();
                                       allUser.forEach(e->{
                                      	 System.out.println(e);
                                       }); 

                 break;

                

                 case 2:
                 System.out.println("Enter Product id to purchase");
                 int p;
                 
                 p=sc.nextInt();
                 System.out.println("Enter Card number and CVV");
                 int cn, cvv;
                 cn=sc.nextInt();
                 cvv=sc.nextInt();
                 Products products = new Products();
                 products.setPid(p);
                 ProductDao productDao = new ProductDao();
                 productDao.AddProduct(products);
                 

                 break;

     
                  default :
                 System.out.println("Choose Valid Option");

                 
             }

         }
         else if(n==2)
         {
             System.out.println("Welcome Shopkeeper\n\n");
             
             System.out.println("Press 1 to Add Product\nPress 2 to Remove Product\nPress 3 to View List\nPress 4 to Edit Product");
             s=sc.nextInt();
             switch(s)
             {
                 case 1:
                  System.out.println("Enter number of items to be inserted\n");
                  int no;
                  no=sc.nextInt();
                 System.out.println("Enter Product Name, No. of Items, Price and Company Name\n");
                for(int i=1;i<=no;i++) {
                	String pn,pp,pc;
                	int pi;
                	pn=sc.next();
                	pi=sc.nextInt();
                	pp=sc.next();
                	pc=sc.next();
                 Products products = new Products();
                 products.setpName(pn);
                 products.setpItems(pi);
                 products.setpPrice(pp);
                 products.setpCompanyName(pc);
                 
                ProductDao productDao = new ProductDao();
                productDao.AddProduct(products);
                }
                
                 break;

                 case 2:
                     System.out.println("Enter Id of item that is to be deleted\n");

                     int id;
                     id=sc.nextInt();
                     Products Products = new Products();
                     Products.setPid(id);
                     ProductDao ProductDao = new ProductDao();
                     ProductDao.RemoveProduct(Products);


                 break;
 
                 case 3:                    
                    ProductDao pd=new ProductDao();
           List<Products> allUser = pd.getAllUser();
                             allUser.forEach(e->{
                            	 System.out.println(e);
                             }); 
                    break;

                

                 case 4:
                	 
                	 System.out.println("Enter Id of item that is to be Updated\n");

                     int d;
                     d=sc.nextInt();
                     Products Product = new Products();
                     Product.setPid(d);
                     ProductDao ProductDa = new ProductDao();
                     ProductDa.RemoveProduct(Product);

                 break;

                 default:
                 System.out.println("Choose Valid Option");

                 
             }

         }
         
         else
         {
             System.out.println("Choose Valid Option");
         }        
        
      
       //Achal
    }
} 
