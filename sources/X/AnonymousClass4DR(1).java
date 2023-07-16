package X;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0002000_I2;
import com.instagram.barcelona.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4DR  reason: invalid class name */
public final class AnonymousClass4DR implements C27828Etx {
    public final List A00;

    public AnonymousClass4DR(List list) {
        C04220Ms.A0B(list, 1);
        this.A00 = list;
    }

    public final /* bridge */ /* synthetic */ C558534v AGc(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C26371qX(C18180wK.A0D(layoutInflater, viewGroup, R.layout.activity_tab_tooltip, false));
    }

    public final /* bridge */ /* synthetic */ void AAp(AnonymousClass3TC r9, C558534v r10) {
        C26371qX r102 = (C26371qX) r10;
        C04220Ms.A0B(r102, 0);
        List<KtCSuperShape0S0002000_I2> list = this.A00;
        List list2 = r102.A00;
        Iterator it = list2.iterator();
        int i = 0;
        for (KtCSuperShape0S0002000_I2 ktCSuperShape0S0002000_I2 : list) {
            int i2 = ktCSuperShape0S0002000_I2.A00;
            if (i2 > 0) {
                TextView textView = (TextView) it.next();
                int i3 = ktCSuperShape0S0002000_I2.A01;
                textView.setVisibility(0);
                textView.setText(String.valueOf(i2));
                textView.setCompoundDrawablesWithIntrinsicBounds(i3, 0, 0, 0);
                textView.setCompoundDrawableTintList(ColorStateList.valueOf(textView.getContext().getColor(R.color.igds_icon_on_color)));
                i++;
                if (i >= list2.size()) {
                    break;
                }
            }
        }
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(8);
        }
    }
}
