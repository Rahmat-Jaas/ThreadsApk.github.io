package com.facebookpay.form.fragment.model;

import X.C04220Ms;
import X.C18200wM;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class FormLoggingEvents implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(69);
    public final FormClickEvent A00;
    public final FormClickEvent A01;
    public final FormClickEvent A02;
    public final FormMutationEvent A03;
    public final FormMutationEvent A04;
    public final List A05;
    public final List A06;
    public final List A07;
    public final List A08;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        List list = this.A05;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0v = C18200wM.A0v(parcel, list);
            while (A0v.hasNext()) {
                ((FormDisplayEvent) A0v.next()).writeToParcel(parcel, i);
            }
        }
        List list2 = this.A06;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0v2 = C18200wM.A0v(parcel, list2);
            while (A0v2.hasNext()) {
                ((FormClickEvent) A0v2.next()).writeToParcel(parcel, i);
            }
        }
        FormClickEvent formClickEvent = this.A01;
        if (formClickEvent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            formClickEvent.writeToParcel(parcel, i);
        }
        FormClickEvent formClickEvent2 = this.A02;
        if (formClickEvent2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            formClickEvent2.writeToParcel(parcel, i);
        }
        FormClickEvent formClickEvent3 = this.A00;
        if (formClickEvent3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            formClickEvent3.writeToParcel(parcel, i);
        }
        List list3 = this.A08;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0v3 = C18200wM.A0v(parcel, list3);
            while (A0v3.hasNext()) {
                ((FormMutationEvent) A0v3.next()).writeToParcel(parcel, i);
            }
        }
        List list4 = this.A07;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0v4 = C18200wM.A0v(parcel, list4);
            while (A0v4.hasNext()) {
                ((FormMutationEvent) A0v4.next()).writeToParcel(parcel, i);
            }
        }
        FormMutationEvent formMutationEvent = this.A04;
        if (formMutationEvent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            formMutationEvent.writeToParcel(parcel, i);
        }
        FormMutationEvent formMutationEvent2 = this.A03;
        if (formMutationEvent2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        formMutationEvent2.writeToParcel(parcel, i);
    }

    public FormLoggingEvents(FormClickEvent formClickEvent, FormClickEvent formClickEvent2, FormClickEvent formClickEvent3, FormMutationEvent formMutationEvent, FormMutationEvent formMutationEvent2, List list, List list2, List list3, List list4) {
        this.A05 = list;
        this.A06 = list2;
        this.A01 = formClickEvent;
        this.A02 = formClickEvent2;
        this.A00 = formClickEvent3;
        this.A08 = list3;
        this.A07 = list4;
        this.A04 = formMutationEvent;
        this.A03 = formMutationEvent2;
    }

    public FormLoggingEvents() {
        this((FormClickEvent) null, (FormClickEvent) null, (FormClickEvent) null, (FormMutationEvent) null, (FormMutationEvent) null, (List) null, (List) null, (List) null, (List) null);
    }
}
