package PaqHotel;

public class Hotel {
    public int numHab = 6;
    public int numPisos = 8;
    public Cliente[][] habitaciones;

    public Hotel() {
        this.habitaciones = new Cliente[this.numPisos][this.numHab];
    }

    public String muestraPantalla() {
        String str = "";

        for(int i = 0; i < this.numPisos; ++i) {
            for(int j = 0; j < this.numHab; ++j) {
                if (this.habitaciones[i][j] == null) {
                    str = str + " L ";
                } else {
                    str = str + " R ";
                }
            }

            str = str + "\n";
        }

        return str;
    }

    public int[] encuentraHab(int tipo) {
        int[] coordenadas = new int[2];
        if (tipo == 1) {
            coordenadas = this.búsquedaHabLibre(0, 5, coordenadas);
        } else if (tipo == 2) {
            coordenadas = this.búsquedaHabLibre(5, 7, coordenadas);
        } else if (tipo == 3) {
            coordenadas = this.búsquedaHabLibre(7, 8, coordenadas);
        }

        return coordenadas;
    }

    private int[] búsquedaHabLibre(int indInf, int indSup, int[] coordenadas) {
        for(int i = indInf; i < indSup; ++i) {
            for(int j = 0; j < this.numHab; ++j) {
                if (this.habitaciones[i][j] == null) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }

    public String verDatosCliente(int[] c) {
        return this.habitaciones[c[0]][c[1]] != null ? this.habitaciones[c[0]][c[1]].toString() : "No existe reserva en la habitación " + (c[1] + 1) + " de la planta " + (c[0] + 1) + ".";
    }

    public void almacenaReserva(int[] coordenadas, Cliente cl) {
        this.habitaciones[coordenadas[0]][coordenadas[1]] = cl;
    }

    public void anulaReserva(int dni, int tipo, int numHab) {
        int[] coordenadas = new int[2];

        for(int i = 0; i < numHab; ++i) {
            coordenadas = this.buscarReserva(dni, tipo);
            this.habitaciones[coordenadas[0]][coordenadas[1]] = null;
        }

    }

    public int[] buscarReserva(int dni, int tipo) {
        int[] coordenadas = new int[2];
        if (tipo == 1) {
            coordenadas = this.búsquedaReservas(dni, 0, 5, coordenadas);
        } else if (tipo == 2) {
            coordenadas = this.búsquedaReservas(dni, 5, 7, coordenadas);
        } else if (tipo == 3) {
            coordenadas = this.búsquedaReservas(dni, 7, 8, coordenadas);
        }

        return coordenadas;
    }

    private int[] búsquedaReservas(int dni, int indInf, int indSup, int[] coordenadas) {
        for(int i = indInf; i < indSup; ++i) {
            for(int j = 0; j < this.numHab; ++j) {
                if (this.habitaciones[i][j] != null && this.habitaciones[i][j].getDni() == dni) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }
}
