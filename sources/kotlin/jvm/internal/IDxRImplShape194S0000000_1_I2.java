package kotlin.jvm.internal;

import X.AnonymousClass00U;
import X.AnonymousClass019;
import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.AnonymousClass3J5;
import X.AnonymousClass3LY;
import X.AnonymousClass3O4;
import X.AnonymousClass74V;
import X.C04220Ms;
import X.C04530Oa;
import X.C09140ev;
import X.C146958n9;
import X.C148838sG;
import X.C18190wL;
import X.C21735BzM;
import X.C25017Ddy;
import X.C25237DiI;
import X.C27952Ew2;
import X.C38039KHq;
import X.C38040KHr;
import X.C567438j;
import X.C63733iD;
import X.C63813iO;
import X.C689045x;
import X.C86074wE;
import X.C882757k;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S1201000_I2;

public class IDxRImplShape194S0000000_1_I2 extends AnonymousClass019 implements AnonymousClass0YP {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IDxRImplShape194S0000000_1_I2(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L_0x002f;
                case 1: goto L_0x0028;
                case 2: goto L_0x0021;
                case 3: goto L_0x001a;
                case 4: goto L_0x0013;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Class<X.Ddy> r3 = X.C25017Ddy.class
            java.lang.String r4 = "disableMediaControlsOnSupStreamPaused"
            java.lang.String r5 = "disableMediaControlsOnSupStreamPaused(ZZ)V"
        L_0x000c:
            r1 = 2
            r6 = 0
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0013:
            java.lang.Class<X.BzM> r3 = X.C21735BzM.class
            java.lang.String r4 = "onBottomSheetPositionChanged"
            java.lang.String r5 = "onBottomSheetPositionChanged(II)V"
            goto L_0x000c
        L_0x001a:
            java.lang.Class<X.3O4> r3 = X.AnonymousClass3O4.class
            java.lang.String r4 = "createEligibilityPersistedState"
            java.lang.String r5 = "createEligibilityPersistedState(Lcom/instagram/service/session/UserSession;Ljava/lang/String;)Lcom/facebook/quickpromotion/sdk/eligibility/QPEligibilityPersistedState;"
            goto L_0x000c
        L_0x0021:
            java.lang.Class<X.38j> r3 = X.C567438j.class
            java.lang.String r4 = "onSaveUserPreferenceCallback"
            java.lang.String r5 = "onSaveUserPreferenceCallback(ZLcom/instagram/user/model/User;)V"
            goto L_0x000c
        L_0x0028:
            java.lang.Class<X.3YK> r3 = X.AnonymousClass3YK.class
            java.lang.String r4 = "md5Hash"
            java.lang.String r5 = "md5Hash(Ljava/lang/String;Landroid/content/Context;)J"
            goto L_0x000c
        L_0x002f:
            java.lang.Class<X.57k> r3 = X.C882757k.class
            java.lang.String r4 = "onSearchQueryChanged"
            java.lang.String r5 = "onSearchQueryChanged(Lcom/instagram/barcelona/profile/followinggraph/data/FollowingGraphGroup;Ljava/lang/String;)V"
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.IDxRImplShape194S0000000_1_I2.<init>(java.lang.Object, int):void");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object value;
        LinkedHashMap linkedHashMap;
        Object obj3 = obj2;
        Object obj4 = obj;
        switch (this.A00) {
            case 0:
                String str = (String) obj3;
                boolean A1Y = AnonymousClass0wJ.A1Y(obj, str);
                C882757k r7 = (C882757k) this.receiver;
                C86074wE r3 = r7.A0C;
                do {
                    value = r3.getValue();
                    Map map = (Map) value;
                    C04220Ms.A0B(map, A1Y ? 1 : 0);
                    linkedHashMap = new LinkedHashMap(map);
                    linkedHashMap.put(obj, str);
                } while (!r3.ADi(value, linkedHashMap));
                Map map2 = r7.A05;
                C148838sG r0 = (C148838sG) map2.get(obj);
                if (r0 != null) {
                    r0.AC7((CancellationException) null);
                }
                map2.put(obj, C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S1201000_I2(r7, obj4, str, (C146958n9) null, 17), AnonymousClass3J5.A00(r7), 3));
                break;
            case 1:
                String str2 = (String) obj4;
                Context context = (Context) obj3;
                boolean A1Y2 = AnonymousClass0wJ.A1Y(str2, context);
                String A0L = AnonymousClass00U.A0L(str2, C09140ev.A02.A04(context));
                long j = 0;
                try {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    C04220Ms.A06(instance);
                    byte[] bytes = A0L.getBytes(AnonymousClass74V.A05);
                    C04220Ms.A06(bytes);
                    byte[] digest = instance.digest(bytes);
                    int length = digest.length;
                    for (int max = Math.max(A1Y2 ? 1 : 0, length - 4); max < length; max++) {
                        j = (j << 8) | ((long) (digest[max] & 255));
                    }
                } catch (NoSuchAlgorithmException unused) {
                }
                return Long.valueOf(j);
            case 2:
                boolean A1X = AnonymousClass0wJ.A1X(obj);
                C567438j r32 = (C567438j) this.receiver;
                if (!A1X) {
                    C63813iO.A03(r32.A00.getContext(), "save_user_preference_failed", 2131836068, 0);
                    break;
                } else {
                    UserSession userSession = r32.A01;
                    C38039KHq A002 = AnonymousClass3LY.A00(userSession);
                    userSession.getUserId();
                    A002.CWx(new C689045x());
                    C63733iD A01 = C63733iD.A01();
                    C63733iD.A08(r32.A00, A01, 2131832990);
                    A01.A0C();
                    C63733iD.A09(C38040KHr.A01, A01);
                    break;
                }
            case 3:
                UserSession userSession2 = (UserSession) obj4;
                String str3 = (String) obj3;
                AnonymousClass0wJ.A1N(userSession2, str3);
                return AnonymousClass3O4.A00(userSession2, str3);
            case 4:
                ((C21735BzM) this.receiver).onBottomSheetPositionChanged(AnonymousClass0wJ.A04(obj), AnonymousClass0wJ.A04(obj2));
                break;
            default:
                boolean A1X2 = AnonymousClass0wJ.A1X(obj);
                boolean A1X3 = AnonymousClass0wJ.A1X(obj2);
                C25017Ddy ddy = (C25017Ddy) this.receiver;
                C04530Oa r33 = ddy.A03;
                ImageView imageView = (ImageView) C18190wL.A0f(r33);
                int i = R.drawable.instagram_microphone_outline_44;
                if (A1X2) {
                    i = R.drawable.instagram_microphone_off_outline_44;
                }
                imageView.setImageResource(i);
                C04530Oa r2 = ddy.A04;
                ImageView imageView2 = (ImageView) C18190wL.A0f(r2);
                int i2 = R.drawable.instagram_video_chat_outline_44;
                if (A1X3) {
                    i2 = R.drawable.instagram_video_chat_off_outline_44;
                }
                imageView2.setImageResource(i2);
                ((View) C18190wL.A0f(r2)).setEnabled(!A1X3);
                ((View) C18190wL.A0f(r33)).setEnabled(!A1X2);
                break;
        }
        return Unit.A00;
    }
}
