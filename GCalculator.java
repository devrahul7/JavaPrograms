class ClassCalculator{
    
    int calculate(int a , int b , String operation){
        int add = (a + b);
        int sub = (a - b);
        int mul = (a *b);
        int div = (a % b);
         
        if (operation.equals("add")){
            return add;
        }else if(operation.equals("sub")) {
            return sub;
        }else if(operation.equals("div")){
            return div;
        }else if(operation.equals(mul)){
            return mul;
        }else{
            return -1000;
        }
    
    }
        double calculate(double a , double b ,String operation){
            double add = (a + b);
            double sub = (a - b);
            double mul = (a *b);
            double div = (a % b);
    
        if (operation.equals("add")){
            return add;
        }else if(operation.equals("sub")){
            return sub;
        }else if (operation.equals("mul")){
            return mul;
        }else if (operation.equals("div")){
            return div;
        }else{
            return -100;
        }
        }
    
    
        int calculate(int a , int b ,int c, String operation){
            int add = (a + b +c );
            int sub = (a+ b - c);
            int mul = (a *b+c);
            int div = (a % b-c);
             
            if (operation.equals("add")){
                return add;
            }else if(operation.equals("sub")) {
                return sub;
            }else if(operation.equals("div")){
                return div;
            }else if(operation.equals(mul)){
                return mul;
            }else{
                return 100;
            }
        }
    
            double calculate(double a , double b ,double c,String operation){
                double add = (a + b+c);
                double sub = (a +b- b);
                double mul = (a *b+c);
                double div = (a % b-c);
        
            if (operation.equals("add")){
                return add;
            }else if(operation.equals("sub")){
                return sub;
            }else if (operation.equals("mul")){
                return mul;
            }else if (operation.equals("div")){
                return div;
            }else{
                return -100;
            }
            }
        
    }
        
    
    public class GCalculator {
        public static void main(String[] args) {
            ClassCalculator obj  = new ClassCalculator();
            System.out.println( obj.calculate(1, 2, "add"));
            System.out.println( obj.calculate(1, 2, "sub"));
            
            
        }
    }
    