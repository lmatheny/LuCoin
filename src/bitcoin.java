/**
 * @author lmatheny
 */
public class bitcoin extends crypto {

    bitcoin() {
        marketCap = "936.289B BTC";
        abbreviation = "BTC";
        creator = "Satoshi Nakamoto";
        logo = "src/pngs/btc.png";
        graph = "src/pngs/btchart.png";
    }

    @Override
    public void makeGUI(String m, String a, String c, double p, String coinPic, String coinGraph) {
        super.makeGUI(m, a, c, p, coinPic, coinGraph);
    }
}
