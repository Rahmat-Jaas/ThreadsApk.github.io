package com.instagram.common.task;

import X.AnonymousClass0wJ;
import X.AnonymousClass2AX;
import X.AnonymousClass2CZ;
import X.AnonymousClass3C0;
import X.AnonymousClass3E9;
import X.AnonymousClass3HT;
import X.AnonymousClass3HX;
import X.AnonymousClass3UG;
import X.AnonymousClass4A9;
import X.AnonymousClass601;
import X.C04220Ms;
import X.C10300i6;
import X.C10450iM;
import X.C109326jp;
import X.C14620pq;
import X.C18180wK;
import X.C18220wO;
import X.C22171Tq;
import X.C57873Cu;
import X.C62323Yh;
import X.C63263h8;
import X.C63913ic;
import X.C83994sM;
import X.FR1;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.RemoteException;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.bloks.util.IDxACallbackShape31S0200000_1_I2;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class IDxLTaskShape3S0500000_1_I2 extends FR1 {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public IDxLTaskShape3S0500000_1_I2(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A05 = i;
        this.A03 = obj2;
        this.A00 = obj;
        this.A02 = obj4;
        this.A04 = obj5;
        this.A01 = obj3;
    }

    public final void A02(Exception exc) {
        if (this.A05 != 0) {
            C04220Ms.A0B(exc, 0);
            C10450iM.A06("GetClientMessageBloksSignature", "reset_password_flow_client_start_query_failed", exc);
            return;
        }
        C63913ic.A0K((AnonymousClass601) this.A02, (C109326jp) this.A04, (AnonymousClass3HX) this.A01, false);
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj) {
        if (this.A05 != 0) {
            if (obj != null) {
                ((Map) this.A02).put("auto_conf_client_message", obj);
                C62323Yh.A00((C10300i6) this.A01, C18180wK.A0X(), "auto_conf_consent", "client_start_message_found", (String) null, "registration_flow", "ar_reset_password_link_sms", (String) null, (String) null, (String) null, (String) null);
            }
            IgFragmentActivity igFragmentActivity = (IgFragmentActivity) this.A00;
            Map map = (Map) this.A02;
            C10300i6 r4 = (C10300i6) this.A01;
            C22171Tq r2 = (C22171Tq) this.A03;
            map.put("password_reset_nonce_code", r2.A05);
            map.put("consent_display_mode", r2.A03);
            AnonymousClass4A9 A002 = C63263h8.A00(r4, r2.A00, map);
            A002.A00 = new IDxACallbackShape31S0200000_1_I2(26, 42, igFragmentActivity, r4);
            igFragmentActivity.schedule(A002);
            return;
        }
        C63913ic.A0K((AnonymousClass601) this.A02, (C109326jp) this.A04, (AnonymousClass3HX) this.A01, obj);
    }

    public final /* bridge */ /* synthetic */ Object call() {
        if (this.A05 != 0) {
            try {
                C57873Cu r1 = (C57873Cu) this.A04;
                AnonymousClass3HT r0 = r1.A00;
                if (r0 == null) {
                    C04220Ms.A0E("feO2Client");
                    throw null;
                }
                AnonymousClass3E9 A002 = AnonymousClass3UG.A00(r0);
                if (A002 != null) {
                    return r1.A01.A02(A002.A00());
                }
                return null;
            } catch (RemoteException e) {
                C10450iM.A06("GetClientMessageBloksSignature", "reset_password_flow_start_query_failed", e);
                return null;
            } catch (SecurityException e2) {
                C10450iM.A06("GetClientMessageBloksSignature", "reset_password_flow_client_start_query_failed", e2);
                return null;
            } catch (AnonymousClass2AX e3) {
                C10450iM.A06("GetClientMessageBloksSignature", "reset_password_flow_client_start_query_failed", e3);
            }
        } else {
            Context A0A = C18220wO.A0A(this.A03);
            Bitmap bitmap = (Bitmap) this.A00;
            AnonymousClass3C0 r6 = new AnonymousClass3C0(AnonymousClass0wJ.A0v(), 2);
            Context applicationContext = A0A.getApplicationContext();
            File A003 = C14620pq.A00(r6.A03);
            Iterator it = r6.A04.iterator();
            while (it.hasNext()) {
                A003 = new File(A003, C18180wK.A0k(it));
            }
            A003.mkdirs();
            C83994sM A004 = AnonymousClass2CZ.A00(applicationContext, r6, A003, "ig_backup_code.jpg", "image/jpeg");
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, A004.BMO());
                A004.ADh();
            } catch (IOException e4) {
                C10450iM.A03("BKBloksActionTakeAndSaveScreenshotImpl", e4.toString());
            }
            return C18180wK.A0Y();
        }
    }

    public final int getRunnableId() {
        if (this.A05 != 0) {
            return 1200830798;
        }
        return 258;
    }

    public final void onFinish() {
        if (this.A05 != 0) {
            super.onFinish();
            return;
        }
        super.onFinish();
        ((Bitmap) this.A00).recycle();
    }
}
