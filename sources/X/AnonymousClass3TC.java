package X;

import com.instagram.barcelona.R;

/* renamed from: X.3TC  reason: invalid class name */
public final class AnonymousClass3TC {
    public static final AnonymousClass3TC A05;
    public static final AnonymousClass3TC A06;
    public static final AnonymousClass3TC A07;
    public static final AnonymousClass3TC A08;
    public static final AnonymousClass3TC A09;
    public static final int[] A0A;
    public static final int[] A0B;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int[] A04;

    static {
        int[] iArr = {R.dimen.abc_edit_text_inset_top_material, R.dimen.abc_edit_text_inset_top_material, R.dimen.abc_edit_text_inset_top_material, R.dimen.abc_edit_text_inset_top_material};
        A0A = iArr;
        int[] iArr2 = {R.dimen.abc_dialog_padding_material, R.dimen.abc_dialog_padding_material, R.dimen.abc_dialog_padding_material, R.dimen.abc_dropdownitem_icon_width};
        A0B = iArr2;
        A05 = new AnonymousClass3TC(iArr, R.color.grey_8, R.color.design_dark_default_color_on_background, R.dimen.abc_text_size_menu_header_material, R.drawable.tooltip_shadow);
        A06 = new AnonymousClass3TC(iArr2, R.color.design_dark_default_color_on_background, R.color.grey_9, R.dimen.abc_text_size_menu_header_material, R.drawable.tooltip_light_shadow);
        A07 = new AnonymousClass3TC(iArr2, R.color.red_5, R.color.design_dark_default_color_on_background, R.dimen.abc_text_size_menu_header_material, R.drawable.tooltip_light_shadow);
        A09 = new AnonymousClass3TC(iArr, R.color.grey_8, R.color.design_dark_default_color_on_background, R.dimen.account_group_management_row_text_size, R.drawable.tooltip_shadow);
        A08 = new AnonymousClass3TC(iArr2, R.color.design_dark_default_color_on_background, R.color.grey_9, R.dimen.account_group_management_row_text_size, R.drawable.tooltip_light_shadow);
    }

    public AnonymousClass3TC(int[] iArr, int i, int i2, int i3, int i4) {
        this.A00 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A01 = i4;
        this.A04 = iArr;
        if (iArr.length != 4) {
            throw C18180wK.A0a("Check failed.");
        }
    }
}
