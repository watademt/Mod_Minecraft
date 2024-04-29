# Mod Minecraft
Основная идея модификации - это добавление в игру двух новых руд, благодаря, которым игрок может улучшить свою экипировку и инструменты. 
## Инструкцию по использованию 
Файл testmod-0.0.1-1.19.jar в папке Mod нужно скопировать в папку mods в файлах игры (если ее нет, нужно ее создать) 
## Описание
- Первая руда называется фуллерин. В программе реализован блок руды фуллерина в классе ModBlocks, так же реализация генерации блока в мире в классе ModPlacedFeatures, у блока есть своя текстура и свойства (например, скорость добычи и тип инструмента, которым ее можно добыть).

![image](https://github.com/watademt/Mod_Minecraft/assets/122484899/8d4d0bdb-6e0c-422f-9854-067edfe51abd "Руда фуллерин")

- При добыче блока руды фуллерина выпадает необработанный фуллерин, который реализован в классе ModItems. Его можно пережарить в печке и получить фуллерин.

![image](https://github.com/watademt/Mod_Minecraft/assets/122484899/0ebef538-063a-4ede-9b0a-05e27f1c9390 "Фуллерин")

- Фуллерин так же явлется объектом класса ModItems. Нужен он для дальнешего создания фуллерита.

![image](https://github.com/watademt/Mod_Minecraft/assets/122484899/d7284cf4-2538-4136-bdd6-baa49f521a09 "Фуллерит")

- Вторая руда называется осмий. В программе реализован блок руды осмия в классе ModBlocks, так же реализация генерации блока в адском мире в классе ModPlacedFeatures, у блока есть своя текстура и различные свойства.

![image](https://github.com/watademt/Mod_Minecraft/assets/122484899/e2faa70a-b585-43ec-b382-b229866a1a40 "Руда осмия")

- При соединение незерита (ресурс, который уже есть в игре), осмия и фуллерина получится слиток фуллерита.

-![image](https://github.com/watademt/Mod_Minecraft/assets/122484899/0a37a239-ecc3-44da-b212-b1f16bc0bc4e "Слиток фуллерита")

- Инструменты описываются в классе ModItems, при этом каждый инструмент это объект разных классов, которые уже предоствлены в Forge.

![image](https://github.com/watademt/Mod_Minecraft/assets/122484899/772903bc-09cd-4002-bc9b-72579b1ee3c4) ![image](https://github.com/watademt/Mod_Minecraft/assets/122484899/fa275ee7-c680-4b9d-89ec-ee10913bb0bb) ![image](https://github.com/watademt/Mod_Minecraft/assets/122484899/c97ccab4-fa3d-44b0-b1d0-5ac5902673f5) ![image](https://github.com/watademt/Mod_Minecraft/assets/122484899/7ba061bf-cc73-4035-b048-d1d5c61e841b) ![image](https://github.com/watademt/Mod_Minecraft/assets/122484899/7bdf6ee6-742e-406c-8b5a-7babd780b7cd)

- Для создание брони нужно создать класс ModArmorMaterial, который будет реализовать интерфейс ArmorMaterial (данный интерфейс уже есть в Forge). Нужно это для того чтобы описать характеристик новой брони.

![image](https://github.com/watademt/Mod_Minecraft/assets/122484899/0915d76a-8744-43b8-8b4d-6222a5497afe) ![image](https://github.com/watademt/Mod_Minecraft/assets/122484899/d6f7dac4-0437-4e81-83b8-e047cd2bbd4a) ![image](https://github.com/watademt/Mod_Minecraft/assets/122484899/58d3e99b-0238-41ac-8601-2fd331a173c2) ![image](https://github.com/watademt/Mod_Minecraft/assets/122484899/2dadee6d-b921-4153-b0a2-e4630be2708a)

- Так же для удобства была создана отдельная вкладка в творческом режиме в классе ModCreativeModeTab.

![image](https://github.com/watademt/Mod_Minecraft/assets/122484899/cd977f7d-3c4c-478a-a74a-01c7301ea47d)



