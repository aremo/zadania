
public class Computer {
    private String producer;
    private double price;

    public Computer(String producer, double price) {
        this.producer = producer;
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null)
//            return false;
//
//        if (!(obj instanceof Computer))
//            return false;
//        Computer comp = (Computer) obj;
//        if(this.producer !=null)
//            if(!this.producer.equals(comp.producer))
//                return false;
//        if (!this.producer.equals(comp.producer))
//            return false;
//        if (this.price != comp.price)
//            return false;
//        return true;
//
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Computer computer = (Computer) o;

        if (Double.compare(computer.price, price) != 0) return false;
        return producer != null ? producer.equals(computer.producer) : computer.producer == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = producer != null ? producer.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Computer " + producer + " " + price;
    }
}
