package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import com.facebook.redex.IDxCListenerShape753S0100000_2_I2;
import com.instagram.barcelona.R;
import java.util.Arrays;

/* renamed from: X.5xP  reason: invalid class name */
public final class AnonymousClass5xP extends C34640IcN implements C81414nk {
    public static final String __redex_internal_original_name = "MusicOverlayEditMusicDurationFragment";
    public View A00;
    public NumberPicker A01;
    public AnonymousClass571 A02;

    public final String getModuleName() {
        return "music_duration_picker";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int intValue;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = (AnonymousClass571) new AnonymousClass7IU(requireActivity()).A01(AnonymousClass571.class);
        View A0K = AnonymousClass0wJ.A0K(view, R.id.music_duration_picker_sheet);
        this.A00 = A0K;
        String str = "durationPickerSheet";
        C86104wH.A1C(AnonymousClass0wJ.A0K(A0K, R.id.music_duration_picker_done_button), 142, this);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            int i = bundle2.getInt(AnonymousClass000.A00(780), 15);
            View view2 = this.A00;
            if (view2 != null) {
                NumberPicker numberPicker = (NumberPicker) AnonymousClass0wJ.A0J(view2, R.id.music_duration_number_picker);
                this.A01 = numberPicker;
                str = "numberPicker";
                if (numberPicker != null) {
                    numberPicker.setMinValue(5);
                    NumberPicker numberPicker2 = this.A01;
                    if (numberPicker2 != null) {
                        numberPicker2.setMaxValue(i);
                        int i2 = (i - 5) + 1;
                        String[] strArr = new String[i2];
                        NumberPicker numberPicker3 = this.A01;
                        if (numberPicker3 != null) {
                            String A0k = AnonymousClass0wJ.A0k(numberPicker3.getContext(), 2131831501);
                            for (int i3 = 0; i3 < i2; i3++) {
                                String format = String.format(A0k, Arrays.copyOf(C18210wN.A1X(i3 + 5), 1));
                                C04220Ms.A06(format);
                                strArr[i3] = format;
                            }
                            NumberPicker numberPicker4 = this.A01;
                            if (numberPicker4 != null) {
                                numberPicker4.setDisplayedValues(strArr);
                                NumberPicker numberPicker5 = this.A01;
                                if (numberPicker5 != null) {
                                    numberPicker5.setOnValueChangedListener(new IDxCListenerShape753S0100000_2_I2(this, 1));
                                    NumberPicker numberPicker6 = this.A01;
                                    if (numberPicker6 != null) {
                                        numberPicker6.setWrapSelectorWheel(false);
                                        NumberPicker numberPicker7 = this.A01;
                                        if (numberPicker7 != null) {
                                            numberPicker7.setDescendantFocusability(393216);
                                            NumberPicker numberPicker8 = this.A01;
                                            if (numberPicker8 != null) {
                                                AnonymousClass571 r0 = this.A02;
                                                if (r0 == null) {
                                                    str = "musicOverlayDurationViewModel";
                                                } else {
                                                    Number number = (Number) r0.A00.A08();
                                                    if (number == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = number.intValue();
                                                    }
                                                    numberPicker8.setValue(intValue);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C04220Ms.A0E(str);
            throw null;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final C10300i6 getSession() {
        return C18180wK.A0W(this, AnonymousClass0RA.A0C);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1264175080);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.music_duration_picker, viewGroup, false);
        C14030oh.A09(-1523788427, A022);
        return inflate;
    }
}
