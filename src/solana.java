/**
 * @author lmatheny
 */
public class solana extends crypto {

    solana() {
        marketCap = "261,900,137 SOL";
        abbreviation = "SOL";
        creator = "Anatoly Yakovenko";
        logo = "src/pngs/sol.png";
        graph = "src/pngs/solchart.png";
    }

    @Override
    public void makeGUI(String m, String a, String c, double p, String coinPic, String coinGraph) {
        super.makeGUI(m, a, c, p, coinPic, coinGraph);
    }
}

