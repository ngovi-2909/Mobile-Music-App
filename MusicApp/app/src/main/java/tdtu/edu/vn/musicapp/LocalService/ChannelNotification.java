package tdtu.edu.vn.musicapp.LocalService;
import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class ChannelNotification extends Application {
    public static final String CHANNEL_ID = "channel_servce_example";

    @Override
    public void onCreate() {
        super.onCreate();
        createChannelNotification();
    }
    private void createChannelNotification() {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID,
                    "Channel Service Example",
                    NotificationManager.IMPORTANCE_DEFAULT);
            channel.setSound(null, null);
            NotificationManager manager = getSystemService((NotificationManager.class));
            if (manager != null){
                manager.createNotificationChannel(channel);
            }
        }
    }
}
