package com.example.myapplication;

import com.example.myapplication.slice.SecondAbilitySliceSlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class SecondAbilitySlice extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(SecondAbilitySliceSlice.class.getName());
    }
}
