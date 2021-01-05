package com.example.myapplication.slice;

import com.example.myapplication.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.aafwk.content.Operation;
import ohos.agp.components.Button;

public class MainAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);
        //获取到button
        Button button = (Button) findComponentById(ResourceTable.Id_button1);
        //给button添加监听事件
        button.setClickedListener(component -> {
            // 点击按钮执行的代码块
            Intent intent1 = new Intent();
            Operation operation = new Intent.OperationBuilder()
                    .withDeviceId("")//方法确定跳转的目标设备，空字符串表示本机
                    .withBundleName("com.example.myapplication") //跳转的目标页面所在的应用
                    .withAbilityName(".SecondAbilitySlice")
                    .build();
            intent1.setOperation(operation);
            //調用方法實現跳轉
            startAbility(intent1);
        });
    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}
