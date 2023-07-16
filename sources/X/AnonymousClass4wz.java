package X;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.4wz  reason: invalid class name */
public final class AnonymousClass4wz extends BroadcastReceiver {
    public final /* synthetic */ C111146mr A00;

    public /* synthetic */ AnonymousClass4wz(C111146mr r1) {
        this.A00 = r1;
    }

    public final void onReceive(Context context, Intent intent) {
        int A01 = C14030oh.A01(1223842156);
        C111146mr r1 = this.A00;
        Intent intent2 = intent;
        Bundle bundleExtra = intent2.getBundleExtra("session_state");
        if (bundleExtra != null) {
            byte[] copyOfRange = Arrays.copyOfRange(AnonymousClass6WG.A00, 0, 10);
            for (int i = 0; i < copyOfRange.length; i++) {
                copyOfRange[i] = (byte) ((copyOfRange[i] ^ 115) ^ 106);
            }
            int i2 = bundleExtra.getInt(new String(copyOfRange));
            int i3 = bundleExtra.getInt(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
            int i4 = bundleExtra.getInt(TraceFieldType.ErrorCode);
            long j = bundleExtra.getLong(I17.A00(527));
            long j2 = bundleExtra.getLong("total_bytes_to_download");
            AnonymousClass5r5 r8 = new AnonymousClass5r5((PendingIntent) bundleExtra.getParcelable("user_confirmation_intent"), bundleExtra.getStringArrayList(C18170wI.A00(1234)), bundleExtra.getStringArrayList("languages"), bundleExtra.getParcelableArrayList("split_file_intents"), i2, i3, i4, j, j2);
            AnonymousClass78d r7 = r1.A03;
            Object[] objArr = {r8};
            if (Log.isLoggable("PlayCore", 3)) {
                AnonymousClass78d.A00(r7.A00, "ListenerRegistryBroadcastReceiver.onReceive: %s", objArr);
            }
            synchronized (r1) {
                Iterator it = new LinkedHashSet(r1.A05).iterator();
                while (it.hasNext()) {
                    ((C148668re) it.next()).CMM(r8);
                }
                Iterator it2 = new HashSet(r1.A04).iterator();
                while (it2.hasNext()) {
                    ((C143938hY) it2.next()).CMM(r8);
                }
            }
        }
        C14030oh.A0E(-1291097105, A01, intent2);
    }
}
