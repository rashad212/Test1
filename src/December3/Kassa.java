package December3;

public class Kassa {
    public static void main(String[] args) {

        Engine cdab = new Engine(4, 1, true, false, true);
        Engine n47d20 = new Engine(4, 1, true, false, false);
        Engine m272 = new Engine(6, 2, true, true, true);
        Engine m271 = new Engine(4, 1, true, true, false);
        Engine n54b30 = new Engine(6, 1, false, false, true);
        Engine n63b44 = new Engine(8, 2, false, false, true);
        Engine ea837 = new Engine(6, 2, false, false, true);

        Gearbox jf011e = new Gearbox(false, false, true, false);
        Gearbox multitronic = new Gearbox(true, false, true, false);
        Gearbox gm6t30 = new Gearbox(true, true, true, false);
        Gearbox g7tronic = new Gearbox(true, false, false, false);
        Gearbox tf80sc = new Gearbox(true, false, false, false);
        Gearbox OAM = new Gearbox(true, false, true, true);
        Gearbox DCT6 = new Gearbox(true, false, false, true);
        Gearbox DQ250 = new Gearbox(false, false, false, true);
        Gearbox DP0 = new Gearbox(true, true, false, false);

        Awd parttime = new Awd(false, true, false);
        Awd xdrive = new Awd(true, false, true);
        Awd matic4 = new Awd(true, true, false);
        Awd haldex = new Awd(true, false, false);
        Awd TerrainResponse = new Awd(false, true, false);

        Temir<Engine> ea888 = new Temir<>(cdab);
        Temir<Engine> e90 = new Temir<>(n47d20);
        Temir<Engine> w212 = new Temir<>(m272);
        Temir<Engine> w204 = new Temir<>(m271);
        Temir<Engine> e60 = new Temir<>(n54b30);
        Temir<Engine> f10 = new Temir<>(n63b44);
        Temir<Engine> audi = new Temir<>(ea837);

        Temir<Gearbox> nissan = new Temir<>(jf011e);
        Temir<Gearbox> nonquattro = new Temir<>(multitronic);
        Temir<Gearbox> gm = new Temir<>(gm6t30);
        Temir<Gearbox> w203 = new Temir<>(g7tronic);
        Temir<Gearbox> aisin = new Temir<>(tf80sc);
        Temir<Gearbox> dq200 = new Temir<>(OAM);
        Temir<Gearbox> getrag = new Temir<>(DCT6);
        Temir<Gearbox> vag = new Temir<>(DQ250);
        Temir<Gearbox> PSR = new Temir<>(DP0);

        Temir<Awd> mitsu = new Temir<>(parttime);
        Temir<Awd> bmw = new Temir<>(xdrive);
        Temir<Awd> volvo = new Temir<>(haldex);
        Temir<Awd> mercedes = new Temir<>(matic4);
        Temir<Awd> landrover = new Temir<>(TerrainResponse);


        System.out.println(bmw.cashOfService());
        System.out.println(mitsu.cashOfService());
        System.out.println(vag.cashOfService());
        System.out.println(volvo.cashOfService());
        System.out.println(mercedes.cashOfService());
        System.out.println(dq200.cashOfService());

    }

}