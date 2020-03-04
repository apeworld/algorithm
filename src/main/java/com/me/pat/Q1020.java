import java.text.DecimalFormat;
import java.util.*;

/**
 * @ClassName Q1007
 * @Description 测试点5超时
 * @Author zhangdongchao
 * @Date 2020/2/17 16:44
 * @Version 1.0
 **/
public class Q1020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int n = Integer.parseInt(input.split(" ")[0]);
        double d = Double.valueOf(input.split(" ")[1]);
        String storage = scanner.nextLine();
        String[] arrStorage = storage.split(" ");
        String price = scanner.nextLine();
        String[] arrRrice = price.split(" ");
        List<Goods> goodsList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            double unitPrice = Double.valueOf(arrRrice[i])/Double.valueOf(arrStorage[i]);
            Goods goods = new Q1020().new Goods();
            goods.setPrice(unitPrice);
            goods.setWeight(Double.valueOf(arrStorage[i]));
            goodsList.add(goods);
        }

        Collections.sort(goodsList, new Comparator<Goods>() {
            @Override
            public int compare(Goods o1, Goods o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() == o2.getPrice()) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });

        double result = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (d <= 0) {
                break;
            }
            Goods goods = goodsList.get(i);
            if (d >= goods.getWeight()) {
                result = result + (goods.getWeight() * goods.getPrice());
                d = d - goods.getWeight();
            } else {
                result = result + (d * goods.getPrice());
                d = d - goods.getWeight();
            }
        }
        DecimalFormat df = new DecimalFormat("#.00");
        String str = df.format(result);
        System.out.println(str);
    }

    class Goods {
        private double weight;
        private double price;

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }
    }
}
