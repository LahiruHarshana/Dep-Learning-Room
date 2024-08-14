import * as fs from 'node:fs/promises';
import * as Path from "node:path";
import * as Process from "process";
import { readdir } from 'node:fs/promises';

// Project Location Related APIs

// CJS
// IMP: Even through --filename and --dirname are defined in the Globlas,
// * they are not global variables
// console.log(--__filename)
// console.log(--__dirname)

// ESM
// console.log(import.meta.filename);
// console.log(import.meta.dirname);
// console.log(Path.dirname(import.meta.filename));

// console.log(Process.env['INIT_CWD']);
// console.log(Process.env['PWD']);
// console.log(Process.cwd());

// ============================================================



const projectPath= process.cwd();
const folderPath = Path.resolve(process.cwd() , `Dep-${1}`);

listFolder();
async function createFolder(){
    try{

        if (await exists(folderPath)){
            console.log("Folder already exists");
        }else{
            await fs.mkdir(folderPath);
            console.log("Folder created");
        }
    }catch (e){
        console.error(e);
    }
}


async function exists(path: string){
    try {
        await fs.access(path)
        return true;
    }catch (e){
        return false
    }
}

async function deleteFolder(){
    if (!await exists(folderPath)){
        console.log("Folder does not exist");
    }else{
        try {
            await fs.rmdir(folderPath);
            console.log("Folder deleted");
        }catch (e){
            console.log(e);
        }
    }
}

async function listFolder(){
    if (!await exists(projectPath)){
        console.log("Folder does not exist");
    }else{
        try {
            const files = await readdir(projectPath,{
                withFileTypes:true
            });
            for (const file of files) {
                console.log(file.name, "-",file.isDirectory() ? "Folder" :"File");
            }
        }catch (e){
            console.log(e);
        }
    }
}

