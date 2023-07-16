package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.login.twofac.model.TrustedDevice;
import java.util.ArrayList;

/* renamed from: X.0xx  reason: invalid class name and case insensitive filesystem */
public final class C18820xx extends BaseAdapter {
    public final ArrayList A00;
    public final Context A01;
    public final AnonymousClass1dO A02;

    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        String A04;
        C04220Ms.A0B(viewGroup, 2);
        if (view == null) {
            Context context = this.A01;
            C04220Ms.A0B(context, 0);
            view = C18180wK.A0D(LayoutInflater.from(context), viewGroup, R.layout.two_fac_trusted_device_row_item, false);
            view.setTag(new AnonymousClass3CH(view));
        }
        Context context2 = this.A01;
        Object tag = view.getTag();
        C04220Ms.A0C(tag, "null cannot be cast to non-null type com.instagram.login.twofac.view.TwoFacTrustedDeviceViewBinder.Holder");
        AnonymousClass3CH r6 = (AnonymousClass3CH) tag;
        Object obj = this.A00.get(i);
        C04220Ms.A06(obj);
        TrustedDevice trustedDevice = (TrustedDevice) obj;
        AnonymousClass1dO r4 = this.A02;
        AnonymousClass0wJ.A1N(context2, r6);
        C18180wK.A1P(trustedDevice, 2, r4);
        String str = trustedDevice.A06;
        if (C04220Ms.A0I(str, "mobile")) {
            i2 = R.drawable.instagram_device_phone_outline_24;
        } else {
            boolean A0I = C04220Ms.A0I(str, "computer");
            i2 = R.drawable.instagram_device_mixed_pano_outline_24;
            if (A0I) {
                i2 = R.drawable.instagram_device_desktop_outline_24;
            }
        }
        if (trustedDevice.A09) {
            A04 = C18190wL.A0g(context2.getResources(), 2131837160);
            C18180wK.A0s(context2, r6.A04, R.color.igds_success);
        } else {
            A04 = C19591Ayr.A04(context2, (double) trustedDevice.A02);
            C04220Ms.A06(A04);
        }
        C18180wK.A0r(context2, r6.A00, i2);
        r6.A03.setText(trustedDevice.A05);
        r6.A04.setText(A04);
        TextView textView = r6.A02;
        StringBuilder A0s = C18190wL.A0s(context2.getResources().getString(2131826227));
        A0s.append(trustedDevice.A07);
        textView.setText(A0s);
        AnonymousClass0wJ.A18(r6.A01, 134, trustedDevice, r4);
        return view;
    }

    public final int getCount() {
        return this.A00.size();
    }

    public final Object getItem(int i) {
        Object obj = this.A00.get(i);
        C04220Ms.A06(obj);
        return obj;
    }

    public final long getItemId(int i) {
        return (long) this.A00.get(i).hashCode();
    }

    public C18820xx(Context context, AnonymousClass1dO r2, ArrayList arrayList) {
        this.A01 = context;
        this.A00 = arrayList;
        this.A02 = r2;
    }
}
