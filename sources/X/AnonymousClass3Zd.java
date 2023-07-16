package X;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;

/* renamed from: X.3Zd  reason: invalid class name */
public final class AnonymousClass3Zd {
    public static void A02(NotificationManager notificationManager, Uri uri, String str, String str2, String str3, int i, int i2, int i3, boolean z, boolean z2) {
        AudioAttributes audioAttributes;
        NotificationChannel notificationChannel = new NotificationChannel(str, str3, i);
        notificationChannel.enableLights(C18180wK.A1V(i2));
        if (i2 != 0) {
            notificationChannel.setLightColor(i2);
        }
        notificationChannel.enableVibration(z);
        notificationChannel.setShowBadge(z2);
        notificationChannel.setLockscreenVisibility(i3);
        if (str2 != null) {
            notificationChannel.setGroup(str2);
        }
        if (uri == null) {
            audioAttributes = null;
        } else {
            audioAttributes = Notification.AUDIO_ATTRIBUTES_DEFAULT;
        }
        notificationChannel.setSound(uri, audioAttributes);
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static NotificationChannel A00(Context context, String str) {
        NotificationManager A03 = C18250wR.A03(context);
        if (A03 != null) {
            return A03.getNotificationChannel(str);
        }
        C10450iM.A03("NotificationChannelsUtils", "Unable to fetch the Notification Manager Service");
        return null;
    }

    public static Boolean A01(Context context, String str, boolean z) {
        NotificationChannelGroup notificationChannelGroup;
        boolean z2 = false;
        if (C09660ft.A01(context)) {
            NotificationManager A03 = C18250wR.A03(context);
            if (A03 == null) {
                C10450iM.A03("NotificationChannelsUtils", "Unable to fetch the Notification Manager Service");
            } else {
                NotificationChannel notificationChannel = A03.getNotificationChannel(str);
                if (notificationChannel != null) {
                    String group = notificationChannel.getGroup();
                    if ((!z || group == null || (notificationChannelGroup = A03.getNotificationChannelGroup(group)) == null || !notificationChannelGroup.isBlocked()) && notificationChannel.getImportance() != 0) {
                        z2 = true;
                    }
                }
            }
            return null;
        }
        return Boolean.valueOf(z2);
    }

    public static void A03(NotificationManager notificationManager, String str) {
        try {
            if (notificationManager.getNotificationChannel(str) != null) {
                notificationManager.deleteNotificationChannel(str);
            }
        } catch (Exception e) {
            C10450iM.A06("NotificationChannelsUtils", AnonymousClass00U.A0V("unable to delete ", str, " notification channel"), e);
        }
    }
}
