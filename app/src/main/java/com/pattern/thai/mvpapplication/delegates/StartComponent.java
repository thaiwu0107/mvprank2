package com.pattern.thai.mvpapplication.delegates;

import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.scope.ActivityScope;
import com.pattern.thai.mvpapplication.mvp.startavtivity.StartActivity;

import dagger.Component;

/**
 *   建立依賴關係
 *   @Component:就是注入器，也可以說是@Inject和@Module的橋樑
 *   @modules:可以建立好幾個module之間的平行關係,可以自己增加想要用到的module
 *   @dependencies:可以建立上一層的父層依賴
 *   @Scope:可以設定這個接口的生命週期或是可以變成單例,也可以建立區域單例譬如下方使用的
 *   @ActivityScope:就是指定這個Component再依賴的對象(${NAME}Activity)裡面是只會創建一次的區域單例
 *   如果不指名,就會一直創新的物件出來,如果用@Singleton就是全部都是單例
 *   透過這些方法就可以在需求者用@Inject的標示方式得到一個不需要自己new的實例
 *
 *   Dagger2依賴關係:
 *   步驟1：查找模塊中是否存在創建該類的方法。
 *   步驟2：若存在創建類方法，查看該方法是否存在參數
 *   步驟2.1：若存在參數，則按從步驟1開始依次初​​始化每個參數
 *   步驟2.2：若不存在參數，則直接初始化該類實例，一次依賴注入到此結束
 *   步驟3：若不存在創建類方法，則查找進樣註解的構造函數，看構造函數是否存在參數
 *   步驟3.1：若存在參數，則從步驟1開始依次初​​始化每個參數
 *   步驟3.2：若不存在參數，則直接初始化該類實例，一次依賴注入到此結束
 *   也就說Dagger2會遞歸的提供依賴。
 */
/**
 * 初始設定溝通介面
 * Created by ggttoo44 on 2017/5/9.
 */

@ActivityScope
@Component(modules = StartModule.class, dependencies = AppComponent.class)
public interface StartComponent {
    void inject(StartActivity activity);
}