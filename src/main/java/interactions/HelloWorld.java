package interactions;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import configurations.Constants;

public class HelloWorld extends ListenerAdapter {

    //for documentation on the JDA visit
    //https://github.com/DV8FromTheWorld/JDA/wiki
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getAuthor().isBot()) {
            return; //do nothing cuz scrub

        }

        System.out.println(event.getMessage().getContentDisplay());

        if (event.getMessage().getContentDisplay().equals(Constants.prefix+"help")) {
            event.getChannel().sendMessage("You have typed " + Constants.prefix + "help").queue();
            event.getChannel().sendMessage("Cynara is powered by the Java JDA!").queue();
            //you gotta add it to the queue otherwise it could cause the whole bot to hang

        }

    }

}
