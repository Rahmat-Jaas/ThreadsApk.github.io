package com.instagram.hashtag.ui;

import X.AnonymousClass8jA;
import X.C11630kW;
import X.C145578kj;
import X.C18190wL;
import X.C19272Atb;
import X.C86164wN;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.facebook.redex.IDxCListenerShape1S0410000_2_I2;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.ui.widget.textview.UpdatableButton;

public class HashtagFollowButton extends UpdatableButton {
    public AnonymousClass8jA A00;
    public String A01;

    public final void A01(C11630kW r8, C145578kj r9, Hashtag hashtag) {
        Hashtag hashtag2 = hashtag;
        boolean A02 = C19272Atb.A02(hashtag);
        AnonymousClass8jA r0 = this.A00;
        if (r0 != null) {
            r0.C1E(hashtag);
        }
        String str = hashtag.A0C;
        if (str != null) {
            A00(this, str, A02);
        }
        setOnClickListener(new IDxCListenerShape1S0410000_2_I2(0, r8, r9, this, hashtag2, A02));
    }

    public static void A00(HashtagFollowButton hashtagFollowButton, String str, boolean z) {
        int i;
        hashtagFollowButton.setIsBlueButton(!z);
        hashtagFollowButton.refreshDrawableState();
        hashtagFollowButton.setEnabled(true);
        Resources A0D = C86164wN.A0D(hashtagFollowButton);
        int i2 = 2131827655;
        if (z) {
            i2 = 2131827657;
        }
        hashtagFollowButton.setContentDescription(C18190wL.A0h(A0D, str, i2));
        if (z) {
            i = 2131827656;
        } else if (!TextUtils.isEmpty(hashtagFollowButton.A01)) {
            hashtagFollowButton.setText(hashtagFollowButton.A01);
            return;
        } else {
            i = 2131827652;
        }
        hashtagFollowButton.setText(i);
    }

    public void setCustomFollowText(String str) {
        this.A01 = str;
    }

    public void setHashtagUpdateListener(AnonymousClass8jA r1) {
        this.A00 = r1;
    }

    public HashtagFollowButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public HashtagFollowButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public HashtagFollowButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
