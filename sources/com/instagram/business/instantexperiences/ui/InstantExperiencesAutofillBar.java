package com.instagram.business.instantexperiences.ui;

import X.AnonymousClass0wJ;
import X.C144478iZ;
import X.C18180wK;
import X.C18220wO;
import X.C86144wL;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData;
import com.facebook.android.instantexperiences.autofill.model.FbAutofillData;
import com.instagram.barcelona.R;
import java.util.Iterator;
import java.util.List;

public class InstantExperiencesAutofillBar extends RelativeLayout {
    private void setAutofillSelectedOnClickListener(View view, C144478iZ r3, BrowserExtensionsAutofillData browserExtensionsAutofillData) {
        C86144wL.A1C(view, browserExtensionsAutofillData, this, r3, 14);
    }

    public final void A00(C144478iZ r8, List list) {
        ViewGroup A0J = C18220wO.A0J(this, R.id.autofill_bar_container);
        A0J.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BrowserExtensionsAutofillData browserExtensionsAutofillData = (BrowserExtensionsAutofillData) ((FbAutofillData) it.next());
            View inflate = C18180wK.A0C(this).inflate(R.layout.instant_experiences_browser_autofill_bar_list_entry, (ViewGroup) null, false);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, 20, 0);
            inflate.setLayoutParams(layoutParams);
            TextView A0L = AnonymousClass0wJ.A0L(inflate, R.id.autofill_bar_list_entry_text);
            A0L.setText(browserExtensionsAutofillData.A01());
            setAutofillSelectedOnClickListener(A0L, r8, browserExtensionsAutofillData);
            A0J.addView(inflate);
        }
    }

    public InstantExperiencesAutofillBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public InstantExperiencesAutofillBar(Context context) {
        super(context);
    }

    public InstantExperiencesAutofillBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
