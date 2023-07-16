package X;

import android.text.TextUtils;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.react.modules.dialog.DialogModule;
import com.fbpay.ptt.impl.ServerCertsVerifier;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5k3  reason: invalid class name */
public final class AnonymousClass5k3 extends C1202479j {
    public C1202379i A00;
    public final ServerCertsVerifier A01;
    public final boolean A02;
    public final C106136eY A03;

    public final C145388kQ A04(C113806sA r9) {
        String str;
        C106136eY r0 = this.A03;
        C1202379i r5 = this.A00;
        String userId = r0.A00.getUserId();
        String A0e = C18180wK.A0e();
        GQLCallInputCInputShape1S0000000 A0L = C86154wM.A0L();
        A0L.A0D(C1198677j.A00(), C61953Wm.A01(43, 9, 14));
        C86154wM.A1M(A0L);
        A0L.A0D(userId, "actor_id");
        String str2 = r5.A00;
        if (!(str2 == null || (str = r5.A01) == null)) {
            GQLCallInputCInputShape0S0000000 A002 = GraphQlCallInput.A00();
            A002.A0F(str2, "otc_session_id");
            A002.A0F(str, "otc_type");
            A0L.A0B(A002, "one_time_checkout_input");
        }
        if (!TextUtils.isEmpty(A0e)) {
            A0L.A0D(A0e, "client_mutation_id");
        }
        String str3 = r5.A03;
        if (!TextUtils.isEmpty(str3)) {
            str3.getClass();
            A0L.A0D(str3, "target_account_id");
        }
        String str4 = r5.A02;
        if (!TextUtils.isEmpty(str4)) {
            A0L.A0D(str4, "receiver_id");
        }
        try {
            C126567fS r1 = (C126567fS) C86104wH.A0p("create", C116436wy.class);
            C67463zb.A01(A0L, r1.A00);
            r1.A02 = true;
            return new C92935kG(C1370385p.A00(), r1.AB4(), C86164wN.A0N(19), AnonymousClass6BW.A01);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw C86114wI.A0k(e);
        }
    }

    public final AnonymousClass7Kx A05(AnonymousClass7EC r6) {
        String str;
        Throwable th = r6.A02;
        if (C18220wO.A1U(th)) {
            Object obj = r6.A01;
            obj.getClass();
            List list = (List) obj;
            if (!list.isEmpty()) {
                synchronized (this) {
                    str = "";
                    if (!this.A02) {
                        str = this.A01.verifyCerts(list);
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    return AnonymousClass7Kx.A0A(new C107426gj(list));
                }
                try {
                    if (!TextUtils.isEmpty(str)) {
                        JSONObject A0j = C18250wR.A0j(str);
                        A0j.getInt(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
                        str = A0j.getString(DialogModule.KEY_MESSAGE);
                    }
                } catch (JSONException unused) {
                }
                th = new AnonymousClass88M(str);
            }
        }
        return AnonymousClass7Kx.A0B((Object) null, th);
    }

    public AnonymousClass5k3(C1202379i r1, ServerCertsVerifier serverCertsVerifier, C104996ci r3, C106136eY r4, boolean z) {
        super(r3);
        this.A03 = r4;
        this.A01 = serverCertsVerifier;
        this.A00 = r1;
        this.A02 = z;
    }
}
