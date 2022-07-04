/**
 * @author lmatheny
 */

public class ethereum extends crypto {

    ethereum() {
        marketCap = "478.608B ETH";
        abbreviation = "ETH";
        creator = "Vitalik Buterin";
        logo = "src/pngs/sol.png";
        graph = "src/pngs/solchart.png";
    }

    @Override
    public void makeGUI(String m, String a, String c, double p, String coinPic, String coinGraph) {
        super.makeGUI(m, a, c, p, coinPic, coinGraph);
    }

}
