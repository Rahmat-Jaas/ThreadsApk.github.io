package com.instagram.direct.wellbeing.unknowncontact.messagerequests.pendingthreads.rows.header;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgLinearLayout;

public final class PendingThreadsMessageSettingsView extends IgLinearLayout {
    public View A00;
    public TextView A01;
    public TextView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PendingThreadsMessageSettingsView(Context context) {
        super(context);
        C04220Ms.A0B(context, 1);
        A00(context);
    }

    public final void setLinkToSettingsClickListener(View.OnClickListener onClickListener) {
        C04220Ms.A0B(onClickListener, 0);
        TextView textView = this.A01;
        if (textView == null) {
            C04220Ms.A0E("linkToSettingsView");
            throw null;
        } else {
            textView.setOnClickListener(onClickListener);
        }
    }

    public final void setLinkToSettingsText(String str) {
        C04220Ms.A0B(str, 0);
        TextView textView = this.A01;
        if (textView == null) {
            C04220Ms.A0E("linkToSettingsView");
            throw null;
        } else {
            textView.setText(str);
        }
    }

    public final void setTitleText(String str) {
        C04220Ms.A0B(str, 0);
        TextView textView = this.A02;
        if (textView == null) {
            C04220Ms.A0E("titleTextView");
            throw null;
        } else {
            textView.setText(str);
        }
    }

    public final void setDividerVisibility(int i) {
        View view = this.A00;
        if (view == null) {
            C04220Ms.A0E("divider");
            throw null;
        } else {
            view.setVisibility(i);
        }
    }

    public final void setLinkToSettingsVisibility(int i) {
        TextView textView = this.A01;
        if (textView == null) {
            C04220Ms.A0E("linkToSettingsView");
            throw null;
        } else {
            textView.setVisibility(i);
        }
    }

    public final void A00(Context context) {
        LayoutInflater.from(context).inflate(R.layout.pending_threads_header_view, this, true);
        this.A02 = (TextView) AnonymousClass0wJ.A0I(this, R.id.header_title);
        this.A01 = (TextView) AnonymousClass0wJ.A0I(this, R.id.link_to_message_settings);
        this.A00 = AnonymousClass0wJ.A0I(this, R.id.divider);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PendingThreadsMessageSettingsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C04220Ms.A0B(context, 1);
        A00(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PendingThreadsMessageSettingsView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C04220Ms.A0B(context, 1);
        A00(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PendingThreadsMessageSettingsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C04220Ms.A0B(context, 1);
        A00(context);
    }
}
