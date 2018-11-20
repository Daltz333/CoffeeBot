import configurations.Constants;
import interactions.HelloWorld;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Game;

import javax.security.auth.login.LoginException;

class BotHandler {
    private JDA jda;

    public void startBot() {
        try {
            jda = new JDABuilder(Constants.token).build();

            updateStatus();

            //add event listeners here
            jda.addEventListener(new HelloWorld());

        } catch (LoginException e) {
            e.printStackTrace();
            System.out.println("ERROR: UNABLE TO LOGIN");

        }


    }

    private void updateStatus() {
        jda.getPresence().setGame(Game.of(Game.GameType.DEFAULT, Constants.prefix+"help for commands!"));

    }


}
