package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.login.api.AssistAccountRecoveryResponse$UhlAccount;
import java.util.List;

/* renamed from: X.0xz  reason: invalid class name and case insensitive filesystem */
public final class C18840xz extends BaseAdapter {
    public Context A00;
    public AnonymousClass1ZI A01;
    public List A02;
    public final C11630kW A03;

    public final int getCount() {
        return this.A02.size();
    }

    public final Object getItem(int i) {
        return this.A02.get(i);
    }

    public final long getItemId(int i) {
        return (long) this.A02.get(i).hashCode();
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = AnonymousClass0wJ.A0H(LayoutInflater.from(this.A00), viewGroup, R.layout.uhl_multiple_account_row_item);
            view.setTag(new AnonymousClass3BY(view));
        }
        AnonymousClass3BY r4 = (AnonymousClass3BY) view.getTag();
        AssistAccountRecoveryResponse$UhlAccount assistAccountRecoveryResponse$UhlAccount = (AssistAccountRecoveryResponse$UhlAccount) this.A02.get(i);
        AnonymousClass1ZI r5 = this.A01;
        C11630kW r2 = this.A03;
        AnonymousClass0wJ.A18(r4.A00, 135, assistAccountRecoveryResponse$UhlAccount, r5);
        r4.A03.setUrl(assistAccountRecoveryResponse$UhlAccount.A00, r2);
        boolean isEmpty = TextUtils.isEmpty(assistAccountRecoveryResponse$UhlAccount.A01);
        TextView textView = r4.A01;
        if (!isEmpty) {
            textView.setVisibility(0);
            textView.setText(assistAccountRecoveryResponse$UhlAccount.A01);
        } else {
            textView.setVisibility(8);
        }
        r4.A02.setText(assistAccountRecoveryResponse$UhlAccount.A03);
        return view;
    }

    public C18840xz(Context context, C11630kW r2, AnonymousClass1ZI r3, List list) {
        this.A02 = list;
        this.A00 = context;
        this.A01 = r3;
        this.A03 = r2;
    }
}
