package com.instagram.debug.devoptions;

import X.AnonymousClass00U;
import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.AnonymousClass1fC;
import X.AnonymousClass4MA;
import X.C04220Ms;
import X.C14030oh;
import X.C58963Iu;
import X.C62763ag;
import android.content.Context;
import android.view.View;
import com.instagram.debug.devoptions.ImageDebugSettingsFragment;

public final class ImageDebugSettingsFragment$createMultiChoiceMenuItem$onClickListener$1 implements View.OnClickListener {
    public final /* synthetic */ int $defaultValueIdx;
    public final /* synthetic */ String[] $displayValues;
    public final /* synthetic */ AnonymousClass1fC $itemsListAdapter;
    public final /* synthetic */ AnonymousClass4MA $menuItem;
    public final /* synthetic */ AnonymousClass0YY $selectionCallback;
    public final /* synthetic */ CharSequence $title;
    public final /* synthetic */ Object[] $values;
    public final /* synthetic */ ImageDebugSettingsFragment this$0;

    public ImageDebugSettingsFragment$createMultiChoiceMenuItem$onClickListener$1(ImageDebugSettingsFragment imageDebugSettingsFragment, String[] strArr, int i, AnonymousClass0YY r4, Object[] objArr, AnonymousClass4MA r6, CharSequence charSequence, AnonymousClass1fC r8) {
        this.this$0 = imageDebugSettingsFragment;
        this.$displayValues = strArr;
        this.$defaultValueIdx = i;
        this.$selectionCallback = r4;
        this.$values = objArr;
        this.$menuItem = r6;
        this.$title = charSequence;
        this.$itemsListAdapter = r8;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-2022188750);
        C58963Iu r0 = new C58963Iu(this.this$0.getSession());
        int length = this.$displayValues.length;
        for (final int i = 0; i < length; i++) {
            final String[] strArr = this.$displayValues;
            String str = strArr[i];
            final AnonymousClass0YY r5 = this.$selectionCallback;
            final Object[] objArr = this.$values;
            final AnonymousClass4MA r8 = this.$menuItem;
            final CharSequence charSequence = this.$title;
            final int i2 = this.$defaultValueIdx;
            final AnonymousClass1fC r12 = this.$itemsListAdapter;
            r0.A09(str, new View.OnClickListener() {
                public final void onClick(View view) {
                    int A05 = C14030oh.A05(322573986);
                    AnonymousClass0YY.this.invoke(objArr[i]);
                    AnonymousClass4MA r5 = r8;
                    ImageDebugSettingsFragment.Companion companion = ImageDebugSettingsFragment.Companion;
                    CharSequence charSequence = charSequence;
                    String[] strArr = strArr;
                    int i = i;
                    r5.A05 = companion.createMultiChoiceLabel(charSequence, strArr[i], AnonymousClass0wJ.A1T(i, i2));
                    r12.notifyDataSetChanged();
                    C14030oh.A0C(-77263273, A05);
                }
            });
        }
        final String[] strArr2 = this.$displayValues;
        final int i3 = this.$defaultValueIdx;
        String A0M = AnonymousClass00U.A0M("Restore Default (", strArr2[i3], ')');
        final AnonymousClass0YY r4 = this.$selectionCallback;
        final Object[] objArr2 = this.$values;
        final AnonymousClass4MA r7 = this.$menuItem;
        final CharSequence charSequence2 = this.$title;
        final AnonymousClass1fC r10 = this.$itemsListAdapter;
        r0.A09(A0M, new View.OnClickListener() {
            public final void onClick(View view) {
                int A05 = C14030oh.A05(-1149352766);
                AnonymousClass0YY.this.invoke(objArr2[i3]);
                r7.A05 = ImageDebugSettingsFragment.Companion.createMultiChoiceLabel(charSequence2, strArr2[i3], true);
                r10.notifyDataSetChanged();
                C14030oh.A0C(-1437590688, A05);
            }
        });
        C62763ag r2 = new C62763ag(r0);
        Context context = this.this$0.getContext();
        C04220Ms.A0A(context);
        r2.A04(context);
        C14030oh.A0C(-433545164, A05);
    }
}
