async function getData(url, resultElement) {
    try {
        const response = await fetch(url, { method: "GET" });
        const data = await response.text();
        resultElement.innerHTML = data;
    } catch (error) {
        console.error("Error:", error);
    }
}

window.addEventListener("load", () => {
    const b1 = document.querySelector("#b1");

    const envios = [{
        idEnv:1,
        nombre:"#env1"
    },
    {
        idEnv:2,
        nombre:"#env2"
    },
    {
        idEnv:3,
        nombre:"#env3"
    }];

    let envio = 1;
    envios.forEach(({idEnv, nombre}) => {
        const env = document.querySelector(nombre);
        if (env) {
            env.addEventListener("change", (event) => {
                event.preventDefault();
                envio = idEnv;
            });
        }
    });

    const productos = [
        {
        id: 1,
        nombre: "papayas",
        check: "#papa2",
        cantidad: "#cantPapa",
        resultado: "#r1"
        },
        {
        id: 2,
        nombre: "melocotones",
        check: "#melo2",
        cantidad: "#cantMelo",
        resultado: "#r2"
        },
        {
        id: 3,
        nombre: "mangos",
        check: "#man2",
        cantidad: "#cantMan",
        resultado: "#r3"
        }
    ];

    const controller = "frutasController";

    b1.addEventListener("click", (event) => {
        event.preventDefault();

        productos.forEach(({ id, nombre, check, cantidad, resultado }) => {
            const checked = document.querySelector(check);
            const cant = document.querySelector(cantidad);
            const res = document.querySelector(resultado);

            if (checked && cant && res) {
                if (checked.checked) {
                    const canti = Number(cant.value);
                    const url = `${controller}?id=${id}&env=${envio}&cant=${canti}`;
                    getData(url, res);
                } else {
                    res.innerHTML = `No has comprado ${nombre}.`;
                }
            }
        });
    });
});