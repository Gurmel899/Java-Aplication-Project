//OOP laptop
package laptop;


public class Laptop {
    
  private String mark,ram,processor,graphic,country;

    public static void main(String[] args) {
       
        laptop dell = new laptop("indonesia","dell vastro","8gb","i5","nividia");
        laptop Hp = new laptop("singapore","hp pavilion","12gb","i7","radeon");
        laptop asus = new laptop("usa","asus rog","8gb","i3","rayzend");
        laptop acer = new laptop("cina","acer slim","8gb","i5","intel hd");
        
        
                        dell.origin();
                        Hp.origin();
                        asus.origin();
                        acer.origin();
                        
                        System.out.println("country " + dell.country + "graphic card " + dell.graphic + 
                                "mark " + dell.mark + "processor " + dell.processor + "ram" + dell.ram);
        
    }

    public Laptop (String country,String mark,String ram,String processor,String graphic){
        
        this.country=country;
        this.graphic=graphic;
        this.mark=mark;
        this.ram=ram;
        this.processor=processor;
        
    }
    private void origin (){
        System.out.println("this.country " + "export laptop");
        
    }
    private void mark (){
        System.out.println("your mark : " + this.mark);
    }
    
}

