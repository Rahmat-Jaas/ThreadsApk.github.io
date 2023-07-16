package X;

import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.os.MessageQueue;
import com.facebook.redex.IDxProviderShape105S0200000_2_I2;
import com.facebook.redex.IDxProviderShape245S0100000_2_I2;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.5uV  reason: invalid class name */
public final class AnonymousClass5uV extends AnonymousClass4TI {
    public final Context A00;
    public final C22261Ud A01;

    public AnonymousClass5uV(Context context, C22261Ud r3) {
        C04220Ms.A0B(context, 1);
        this.A00 = context;
        this.A01 = r3;
    }

    public final void A03() {
        C10300i6 r7 = this.A01.A00;
        C04220Ms.A06(r7);
        MessageQueue myQueue = Looper.myQueue();
        C04220Ms.A06(myQueue);
        Context context = this.A00;
        AnonymousClass6QL r3 = new AnonymousClass6QL();
        AnonymousClass76G r5 = new AnonymousClass76G(context, new AnonymousClass47S(new IDxProviderShape245S0100000_2_I2(context, 17)));
        Context applicationContext = context.getApplicationContext();
        AnonymousClass7D8.A01 = new AnonymousClass47S(new IDxProviderShape105S0200000_2_I2(1, applicationContext, r3));
        AnonymousClass7D8.A00 = new AnonymousClass47S(new IDxProviderShape245S0100000_2_I2(applicationContext, 4));
        AnonymousClass7D8.A02 = r5;
        myQueue.addIdleHandler(new C954160g(this, r7));
        HGC.A07.put(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, new C23229Cod());
        C30920Gb9.A01().A02(new FZ1(C18230wP.A09(context)), C28174Ezk.A00(229));
        Object systemService = context.getSystemService("notification");
        C04220Ms.A0C(systemService, AnonymousClass000.A00(186));
        NotificationManager notificationManager = (NotificationManager) systemService;
        AnonymousClass3Zd.A02(notificationManager, (Uri) null, C18170wI.A00(1441), (String) null, context.getString(2131821985), 3, 0, 1, false, true);
        AnonymousClass3Zd.A02(notificationManager, (Uri) null, C18170wI.A00(1445), (String) null, context.getString(2131821990), 4, 0, 1, false, true);
        AnonymousClass3Zd.A02(notificationManager, (Uri) null, C18170wI.A00(1442), (String) null, context.getString(2131821986), 4, 0, 1, false, true);
        AnonymousClass3Zd.A02(notificationManager, (Uri) null, C18170wI.A00(1444), (String) null, context.getString(2131821989), 3, 0, 1, false, true);
        AnonymousClass3Zd.A02(notificationManager, (Uri) null, C18170wI.A00(1446), (String) null, context.getString(2131821991), 3, 0, 1, false, true);
        NotificationManager notificationManager2 = notificationManager;
        AnonymousClass3Zd.A02(notificationManager2, (Uri) null, C18170wI.A00(1447), (String) null, context.getString(2131821984), 4, 0, 1, false, true);
        AnonymousClass3Zd.A02(notificationManager2, (Uri) null, C18170wI.A00(1443), (String) null, context.getString(2131821988), 4, 0, 1, false, true);
        AnonymousClass3Zd.A02(notificationManager2, (Uri) null, C18170wI.A00(1440), (String) null, context.getString(2131821983), 4, 0, 1, false, true);
        AnonymousClass3Zd.A02(notificationManager, (Uri) null, "ig_other", (String) null, context.getResources().getString(2131821987), 3, 0, 1, false, true);
        AnonymousClass3Zd.A02(notificationManager, (Uri) null, C18170wI.A00(1141), (String) null, context.getResources().getString(2131831901), 2, 0, 1, false, false);
    }
}
