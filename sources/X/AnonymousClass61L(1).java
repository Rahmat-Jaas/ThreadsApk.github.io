package X;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.PowerManager;
import android.text.TextUtils;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.service.session.UserSession;

/* renamed from: X.61L  reason: invalid class name */
public final class AnonymousClass61L extends AnonymousClass0gG {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ PowerManager.WakeLock A01;
    public final /* synthetic */ C91175fj A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass61L(Intent intent, PowerManager.WakeLock wakeLock, C91175fj r4) {
        super(53);
        this.A02 = r4;
        this.A00 = intent;
        this.A01 = wakeLock;
    }

    public final void run() {
        UserSession userSession;
        String str;
        try {
            C91175fj r2 = this.A02;
            Intent intent = this.A00;
            if ("com.facebook.rti.fbns.intent.RECEIVE".equals(intent.getAction())) {
                intent.toString();
                if (((C12530m4) C17250ua.A00).A00(intent, r2.A02).BZk()) {
                    String stringExtra = intent.getStringExtra("receive_type");
                    boolean equals = DialogModule.KEY_MESSAGE.equals(stringExtra);
                    String A002 = AnonymousClass000.A00(1156);
                    if (equals) {
                        String stringExtra2 = intent.getStringExtra("token");
                        String string = r2.A01.A00.getString(A002, "");
                        intent.getStringExtra("extra_notification_id");
                        if (TextUtils.isEmpty(string) || string.equals(stringExtra2)) {
                            C31084GfL A003 = C31084GfL.A00(intent, (String) null, false);
                            if (A003 == null || (str = A003.A0U) == null) {
                                userSession = null;
                            } else {
                                userSession = C30843GYs.A00(str);
                            }
                            PushChannelType pushChannelType = PushChannelType.FBNS;
                            C102096Tu.A00(intent, pushChannelType, userSession);
                            if (userSession == null || !C30843GYs.A01(userSession)) {
                                C29620FrP.A00().A0B(intent, pushChannelType, AnonymousClass7GV.A00(pushChannelType));
                            } else {
                                C86134wK.A0Y(userSession).A00(intent, pushChannelType);
                            }
                            C16850tr.A00(r2.A00, intent);
                        } else {
                            AnonymousClass0LU.A0C("FBNSProcessor", "Dropping unintended message.");
                        }
                    } else if ("registered".equals(stringExtra)) {
                        String stringExtra3 = intent.getStringExtra("data");
                        SharedPreferences.Editor edit = r2.A01.A00.edit();
                        edit.putString(A002, stringExtra3);
                        edit.apply();
                        boolean A022 = AnonymousClass0s5.A02(C12710mM.A00(intent));
                        HGC A004 = C29620FrP.A00();
                        Context context = r2.A00;
                        Context applicationContext = context.getApplicationContext();
                        PushChannelType pushChannelType2 = PushChannelType.FBNS;
                        int i = 2;
                        if (A022) {
                            i = 3;
                        }
                        A004.A0A(applicationContext, pushChannelType2, stringExtra3, i, pushChannelType2.equals(C1190873l.A00().B59()));
                        HGC hgc = AnonymousClass7GV.A00;
                        if (hgc != null) {
                            hgc.A08(context, pushChannelType2, 1);
                        } else {
                            C10450iM.A03("FbnsPushNotificationProcessor onRegistered", "Unable to log because delegate was null");
                        }
                        C10300i6 r1 = r2.A00;
                        if (r1 instanceof UserSession) {
                            C28161tl A012 = AnonymousClass3WS.A01(C05030Qo.A02(r1));
                            C04220Ms.A0B(stringExtra3, 0);
                            C18180wK.A0v(C28161tl.A02(A012), "fbns_token", stringExtra3);
                        }
                    } else if ("reg_error".equals(stringExtra)) {
                        String stringExtra4 = intent.getStringExtra("data");
                        C10450iM.A03("FbnsPushNotificationProcessor onRegistrationError", stringExtra4);
                        HGC hgc2 = AnonymousClass7GV.A00;
                        if (hgc2 != null) {
                            hgc2.A09(r2.A00, PushChannelType.FBNS, stringExtra4, 1);
                        } else {
                            C10450iM.A03("FbnsPushNotificationProcessor onRegistrationError", "Unable to log because delegate was null");
                        }
                    } else if (!"deleted".equals(stringExtra) && !"unregistered".equals(stringExtra)) {
                        AnonymousClass0LU.A0B("FBNSProcessor", "Unknown message type");
                    }
                }
            }
        } finally {
            C13750oF.A02(this.A01);
        }
    }
}
